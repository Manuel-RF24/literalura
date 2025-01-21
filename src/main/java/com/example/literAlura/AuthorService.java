package com.example.literAlura;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    // Método para obtener autores vivos en un determinado año
    public List<Author> getAuthorsAliveInYear(int year) {
        int birthYear = year;
        int deathYear = year;
        return authorRepository.findByBirthYearLessThanEqualAndDeathYearGreaterThanEqualOrDeathYearNull(birthYear, deathYear);
    }
}

