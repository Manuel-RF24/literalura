package com.example.literAlura;

public class Author {

    private String name;
    private Integer birthYear;
    private Integer deathYear;

    // Constructor
    public Author(String name, Integer birthYear, Integer deathYear) {
        this.name = name;
        this.birthYear = birthYear;
        this.deathYear = deathYear;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public Integer getDeathYear() {
        return deathYear;
    }

    public void setDeathYear(Integer deathYear) {
        this.deathYear = deathYear;
    }

    @Override
    public String toString() {
        return "Author: " + name + ", Birth Year: " + birthYear + ", Death Year: " + (deathYear != null ? deathYear : "Still alive");
    }

    // Método para comprobar si el autor estaba vivo en un determinado año
    public boolean isAliveInYear(int year) {
        return (birthYear <= year) && (deathYear == null || deathYear >= year);
    }
}
