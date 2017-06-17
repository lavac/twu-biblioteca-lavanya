package com.twu.biblioteca;

import com.twu.menu.ListBookOption;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ListBookOptionTest {

@Test
public void shouldDisplayAvailableBooks() {

    ListBookOption listBookOption = new ListBookOption();
    List<String> expectedBooks = new ArrayList<>();
    final String stringFormat = String.format("%-20s  %-20s %s", "Name",
                                              "Author",
                                              "YOP"
    );

    expectedBooks.add(stringFormat);
    expectedBooks.add(new Book("2 States", "Chetan Bhagat", 2009).toString());
    expectedBooks.add(new Book("The Alchemist", "Poulo coehlo", 1999).toString());
    expectedBooks.add(new Book("Five point someone", "unknown", 2012).toString());

    assertEquals(expectedBooks, listBookOption.executeMenuOption());

}

}
