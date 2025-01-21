package com.example.literAlura;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class JsonParser {
    public Book parseJsonToBook(String jsonResponse) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(jsonResponse, Book.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;  // O puedes lanzar una excepción si prefieres
        }
    }
}
