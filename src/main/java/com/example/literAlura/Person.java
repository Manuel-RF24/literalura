package com.example.literAlura;

public class Person {
    private Integer birthYear;
    private Integer deathYear;
    private String name;

    // Getters and Setters

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    // Other getters and setters for all fields...

    @Override
    public String toString() {
        return "Person{" +
                "birthYear=" + birthYear +
                ", deathYear=" + deathYear +
                ", name='" + name + '\'' +
                '}';
    }
}
