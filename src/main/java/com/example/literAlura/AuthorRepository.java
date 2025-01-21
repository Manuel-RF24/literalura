package com.example.literAlura;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

    // Consulta derivada para obtener autores vivos en un año determinado
    List<Author> findByBirthYearLessThanEqualAndDeathYearGreaterThanEqualOrDeathYearNull(int birthYear, int deathYear);
}

