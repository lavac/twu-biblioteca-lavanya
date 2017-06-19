package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MovieTest {

    @Test
    public void instanceOfMoviesWithSameAttributesAreSame() {
        Movie movie1=new Movie("Money ball", "Bennett Miller", 2011, 4);
        Movie movie2=new Movie("Money ball", "Bennett Miller", 2011, 4);
        assertEquals(movie1, movie2);
    }

    @Test
    public void shouldDisplayMovieInStringFormat() {
        Movie movie=new Movie("Money ball", "Bennett Miller", 2011, 4);
        String movieInStringFormat = "Money ball           | Bennett Miller       | 2011 | 4.0";
        System.out.println(movie.toString());
        assertEquals(movieInStringFormat, movie.toString());
    }

    @Test
    public void shouldReturnMovieName() {
        Movie movie=new Movie("Money ball", "Bennett Miller", 2011, 4);
        String bookName = "Money ball";
        assertTrue(bookName.equals(movie.getName()));
    }

}
