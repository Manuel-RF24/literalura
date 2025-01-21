package com.example.literAlura;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookService bookService = new BookService();
        List<Book> booksSearched = new ArrayList<>();
        List<Author> authorsList = new ArrayList<>();  // Lista de autores

        while (true) {
            System.out.println("Bienvenido al catálogo LiterAlura");
            System.out.println("1. Buscar libro por título");
            System.out.println("2. Ver lista de libros buscados");
            System.out.println("3. Ver lista de autores");
            System.out.println("4. Listar autores vivos en determinado año");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            int option = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer del scanner

            switch (option) {
                case 1:
                    System.out.print("Introduce el título del libro: ");
                    String title = scanner.nextLine();
                    Book book = bookService.getBookByTitle(title);
                    if (book != null) {
                        System.out.println("Libro encontrado:");
                        System.out.println(book);
                        booksSearched.add(book);  // Añadir el libro a la lista
                        authorsList.add(book.getAuthor()); // Añadir el autor a la lista
                    } else {
                        System.out.println("No se encontraron resultados.");
                    }
                    break;
                case 2:
                    // Mostrar todos los libros buscados
                    System.out.println("Libros buscados:");
                    if (booksSearched.isEmpty()) {
                        System.out.println("No se han buscado libros aún.");
                    } else {
                        for (Book b : booksSearched) {
                            System.out.println(b);
                        }
                    }
                    break;
                case 3:
                    // Mostrar todos los autores
                    System.out.println("Autores:");
                    if (authorsList.isEmpty()) {
                        System.out.println("No se han encontrado autores.");
                    } else {
                        for (Author author : authorsList) {
                            System.out.println(author);
                        }
                    }
                    break;
                case 4:
                    // Listar autores vivos en un determinado año
                    System.out.print("Introduce el año: ");
                    int year = scanner.nextInt();
                    System.out.println("Autores vivos en el año " + year + ":");
                    boolean found = false;
                    for (Author author : authorsList) {
                        if (author.isAliveInYear(year)) {
                            System.out.println(author);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("No se encontraron autores vivos en ese año.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
