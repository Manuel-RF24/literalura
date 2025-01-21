package com.example.literAlura;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/add")
    public Book addBook(@RequestBody Book book) {
        return bookService.saveBook(book);  // Guardamos el libro en la base de datos
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);  // Consultamos el libro por su ID
    }

    @GetMapping("/list")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();  // Consultamos todos los libros
    }
}

