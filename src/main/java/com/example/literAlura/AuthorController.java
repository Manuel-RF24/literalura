package com.example.literAlura;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping("/aliveInYear/{year}")
    public List<Author> getAuthorsAliveInYear(@PathVariable int year) {
        try {
            return authorService.getAuthorsAliveInYear(year);
        } catch (Exception e) {
            throw new InvalidYearException("Invalid year entered: " + year);
        }
    }

    @ExceptionHandler(InvalidYearException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleInvalidYearException(InvalidYearException ex) {
        return ex.getMessage();
    }

    public static class InvalidYearException extends RuntimeException {
        public InvalidYearException(String message) {
            super(message);
        }
    }
}
