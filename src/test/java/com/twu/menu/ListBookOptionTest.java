package com.twu.menu;

import com.twu.biblioteca.Item;
import com.twu.biblioteca.Repository;
import com.twu.biblioteca.UserAuthentication;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ListBookOptionTest {

    @Test
    public void shouldDisplayAvailableBooks() {
        Repository repository = new Repository(new UserAuthentication());
        ListItems listBookOption = new ListItems("book");
        List<String> expectedResult = new ArrayList<>();
        final String stringFormat = String.format("%-20s  %-20s %-10s", "Name",
                                                  "Author",
                                                  "YOP"
        );

        expectedResult.add(stringFormat);
        for (Item book : repository.getItems("book"))
            expectedResult.add(book.toString());

        assertEquals(expectedResult, listBookOption.executeMenuOption(repository, null, null).getResponse());
    }
}
