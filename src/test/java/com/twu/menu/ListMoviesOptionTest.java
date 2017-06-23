package com.twu.menu;

import com.twu.biblioteca.Item;
import com.twu.biblioteca.Repository;
import com.twu.biblioteca.UserAuthentication;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ListMoviesOptionTest {

    @Test
    public void shouldDisplayAvailableMovies() {
        Repository repository = new Repository(new UserAuthentication());
        ListItems listMovieOption = new ListItems("movie");
        List<String> expectedResult = new ArrayList<>();
        final String stringFormat = String.format("%-30s  %-30s %-20s %-20s", "Name",
                                                  "Director", "Year",
                                                  "Rating"
        );

        expectedResult.add(stringFormat);
        for (Item movie : repository.getItems("movie"))
            expectedResult.add(movie.toString());

        assertEquals(expectedResult, listMovieOption.executeMenuOption(repository, null, null).getResponse());
    }
}

