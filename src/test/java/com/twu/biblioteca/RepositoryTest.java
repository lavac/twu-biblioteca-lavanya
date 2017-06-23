package com.twu.biblioteca;

import com.twu.menu.CheckOutItem;
import com.twu.menu.ReturnItem;
import com.twu.models.TestConsoleInputReader;
import com.twu.models.TestConsoleOutputWriter;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RepositoryTest {

    @Test
    public void shouldReturnTheListOfBooks() {
        Repository bookInventory = new Repository(new UserAuthentication());
        List<Book> expectedBooks = new ArrayList<>();

        expectedBooks.add(new Book("2 States", "Chetan Bhagat", 2009));
        expectedBooks.add(new Book("The Alchemist", "Poulo coelho", 1999));
        expectedBooks.add(new Book("Five point someone", "unknown", 2012));

        assertEquals(expectedBooks, bookInventory.getItems("book"));
    }

    @Test
    public void shouldReturnTheListOfMovies() {
        Repository bookInventory = new Repository(new UserAuthentication());
        List<Movie> expectedMovies = new ArrayList<>();

        expectedMovies.add(new Movie("Money ball", "Bennett Miller", 2011, 4));
        expectedMovies.add(new Movie("The Pursuit of Happyness", "Gabriele Muccino", 2006, 5));
        expectedMovies.add(new Movie("Crazy, Stupid, Love.", "Glenn Ficarra", 2011, 3));

        assertEquals(expectedMovies, bookInventory.getItems("movie"));
    }

    @Test
    public void shouldBeAbleToCheckOutABook() {
        Repository bookInventory = new Repository(new UserAuthentication());
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Thank you! Enjoy the book!\n");
        String bookToBeCheckedOut = "The Alchemist\n";

        TestConsoleInputReader inputReader = new TestConsoleInputReader(bookToBeCheckedOut);
        TestConsoleOutputWriter outputWriter = new TestConsoleOutputWriter();
        CheckOutItem checkOutBook = new CheckOutItem("book");

        assertEquals(expectedResult, checkOutBook.executeMenuOption(bookInventory, inputReader, outputWriter).getResponse());
    }

    @Test
    public void checkedOutBookShouldNotBeInRepository() {
        Repository repository = new Repository(new UserAuthentication());
        String bookNameToBeCheckedOut = "The Alchemist\n";
        Book bookToBeCheckedOut = new Book("The Alchemist", "Poulo coehlo", 1999);
        CheckOutItem checkOut = new CheckOutItem("book");

        TestConsoleInputReader inputReader = new TestConsoleInputReader(bookNameToBeCheckedOut);
        TestConsoleOutputWriter outputWriter = new TestConsoleOutputWriter();

        checkOut.executeMenuOption(repository, inputReader, outputWriter);

        assertFalse(repository.getItems("book").contains(bookToBeCheckedOut));
    }

    @Test
    public void shouldBeAbleToReturnBookThatBelongsToRepository() {
        Repository repository = new Repository(new UserAuthentication());
        String book = "The Alchemist\n";

        CheckOutItem checkOut = new CheckOutItem("book");
        TestConsoleInputReader inputReader = new TestConsoleInputReader(book);
        TestConsoleOutputWriter outputWriter = new TestConsoleOutputWriter();

        checkOut.executeMenuOption(repository, inputReader, outputWriter);

        ReturnItem returnOption = new ReturnItem("book");
        TestConsoleInputReader inputReader1 = new TestConsoleInputReader(book);
        Book bookToBeReturned = new Book("The Alchemist", "Poulo coehlo", 1999);

        returnOption.executeMenuOption(repository, inputReader1, outputWriter);

        assertTrue(repository.getItems("book").contains(bookToBeReturned));
    }

    @Test
    public void shouldBeAbleToReturnMovieThatBelongsToRepository() {
        Repository repository = new Repository(new UserAuthentication());
        String movie = "Money ball\n";

        CheckOutItem checkOut = new CheckOutItem("movie");
        TestConsoleInputReader inputReader = new TestConsoleInputReader(movie);
        TestConsoleOutputWriter outputWriter = new TestConsoleOutputWriter();

        checkOut.executeMenuOption(repository, inputReader, outputWriter);

        ReturnItem returnOption = new ReturnItem("movie");
        TestConsoleInputReader inputReader1 = new TestConsoleInputReader(movie);
        Movie movieToBeReturned = new Movie("Money ball", "Bennett Miller", 2011, 4);

        returnOption.executeMenuOption(repository, inputReader1, outputWriter);

        assertTrue(repository.getItems("movie").contains(movieToBeReturned));
    }
}

