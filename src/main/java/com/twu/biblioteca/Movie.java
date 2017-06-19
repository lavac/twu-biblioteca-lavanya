package com.twu.biblioteca;

public class Movie implements Item {
    private String name;
    private String director;
    private int year;
    private double rating;

    public Movie(String name, String director, int year, double rating) {
        this.name = name;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }

    public String toString() {
        return String.format("%-20s | %-20s | %s | %s", name, director,
                             year, rating
        );
    }
    @Override
    public boolean equals(Object obj) {
        Movie movie = (Movie) obj;
        if (this.name == movie.name)
            return true;
        return false;
    }

    public String getName() {
        return name;
    }

}
