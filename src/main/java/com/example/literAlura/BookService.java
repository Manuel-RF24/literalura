package com.example.literAlura;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BookService {

    private static final String BASE_URL = "https://gutendex.com/books/";

    public Book getBookByTitle(String title) {
        try {
            // Construir la URL para la consulta por título
            String url = BASE_URL + "?search=" + title;
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            // Enviar la solicitud HTTP
            HttpClient client = HttpClient.newHttpClient();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Deserializar la respuesta JSON en un objeto Book
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootNode = objectMapper.readTree(response.body());
            JsonNode bookNode = rootNode.path("results").get(0);

            // Obtener el primer autor de la lista
            JsonNode authorNode = bookNode.path("authors").get(0);
            String authorName = authorNode.path("name").asText();
            Integer birthYear = authorNode.path("birth_year").asInt();
            Integer deathYear = authorNode.path("death_year").asInt();

            Author author = new Author(authorName, birthYear, deathYear);
            String bookTitle = bookNode.path("title").asText();
            String language = bookNode.path("languages").get(0).asText(); // Tomando el primer idioma
            int downloadCount = bookNode.path("download_count").asInt();

            Book book = new Book(bookTitle, author, language, downloadCount);
            return book;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}


