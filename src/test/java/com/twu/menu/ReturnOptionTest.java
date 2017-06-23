package com.twu.menu;

import com.twu.biblioteca.Book;
import com.twu.biblioteca.Repository;
import com.twu.biblioteca.UserAuthentication;
import com.twu.models.TestConsoleInputReader;
import com.twu.models.TestConsoleOutputWriter;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ReturnOptionTest {

    @Test
    public void returnedBookShouldBeAddTotheAvailableBookList() {
        Repository repository = new Repository(new UserAuthentication());
        String book = "2 States\n";

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
    public void customerShouldBeAbleToReturnTheCheckedOutBook() {
        Repository repository = new Repository(new UserAuthentication());
        String book = "The Alchemist\n";
        CheckOutItem checkOut = new CheckOutItem("book");
        TestConsoleInputReader inputReader = new TestConsoleInputReader(book);
        TestConsoleOutputWriter outputWriter = new TestConsoleOutputWriter();
        checkOut.executeMenuOption(repository, inputReader, outputWriter);

        ReturnItem returnOption = new ReturnItem("book");
        TestConsoleInputReader inputReader1 = new TestConsoleInputReader(book);

        List<String> expectedResult = new ArrayList<>();

        expectedResult.add("Thank you for returning the book!\n");

        assertEquals(expectedResult, returnOption.executeMenuOption(repository, inputReader1, outputWriter).getResponse());
    }

    @Test
    public void ShouldNotAcceptTheBookThatDoesnotBelongTtheRepository() {
        Repository repository = new Repository(new UserAuthentication());

        String checkedOutBook = "2 States\n";
        CheckOutItem checkOut = new CheckOutItem("book");
        TestConsoleInputReader inputReader = new TestConsoleInputReader(checkedOutBook);
        TestConsoleOutputWriter outputWriter = new TestConsoleOutputWriter();

        checkOut.executeMenuOption(repository, inputReader, outputWriter);

        String bookToBeReturned = "Some Other Book\n";
        ReturnItem returnOption = new ReturnItem("book");
        TestConsoleInputReader inputReader1 = new TestConsoleInputReader(bookToBeReturned);

        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("That is not a valid book to return!\n");

        assertEquals(expectedResult, returnOption.executeMenuOption(repository, inputReader1, outputWriter).getResponse());
    }
}
