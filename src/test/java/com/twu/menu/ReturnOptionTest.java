package com.twu.menu;

import com.twu.biblioteca.Book;
import com.twu.biblioteca.Repository;
import com.twu.models.TestConsoleInputReader;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ReturnOptionTest {

    @Test
    public void returnedBookShouldBeAddedTotheAvailableBookList() {
        Repository repository = new Repository();
        String book = "2 States\n";

        CheckOutBook checkOut = new CheckOutBook();
        TestConsoleInputReader inputReader = new TestConsoleInputReader(book);
        checkOut.executeMenuOption(repository, inputReader);

        Return returnOption = new Return();
        TestConsoleInputReader inputReader1 = new TestConsoleInputReader(book);
        Book bookToBeReturned = new Book("The Alchemist", "Poulo coehlo", 1999);
        returnOption.executeMenuOption(repository, inputReader1);

        assertTrue(repository.getAvailableItems().contains(bookToBeReturned));
    }

    @Test
    public void customerShouldBeAbleToReturnTheCheckedOutBook() {
        Repository repository = new Repository();

        String book = "2 States\n";
        CheckOutBook checkOut = new CheckOutBook();
        TestConsoleInputReader inputReader = new TestConsoleInputReader(book);
        checkOut.executeMenuOption(repository, inputReader);

        Return returnOption = new Return();
        TestConsoleInputReader inputReader1 = new TestConsoleInputReader(book);
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Thank you for returning the book.");

        assertEquals(expectedResult, returnOption.executeMenuOption(repository, inputReader1).getResponse());
    }

    @Test
    public void ShouldNotAcceptTheBookThatDoesnotBelongTtheRepository() {
        Repository repository = new Repository();

        String checkedOutBook = "2 States\n";
        CheckOutBook checkOut = new CheckOutBook();
        TestConsoleInputReader inputReader = new TestConsoleInputReader(checkedOutBook);
        checkOut.executeMenuOption(repository, inputReader);

        String bookToBeReturned = "Some Other Book\n";
        Return returnOption = new Return();
        TestConsoleInputReader inputReader1 = new TestConsoleInputReader(bookToBeReturned);

        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("That is not a valid book to return.");

        assertEquals(expectedResult, returnOption.executeMenuOption(repository, inputReader1).getResponse());
    }

    @Test
    public void shouldDisplayMenuOption() {
        Return returnOption = new Return();
        String expectedMenuOption = "Return";

        assertEquals(expectedMenuOption, returnOption.getMenuOption());
    }
}
