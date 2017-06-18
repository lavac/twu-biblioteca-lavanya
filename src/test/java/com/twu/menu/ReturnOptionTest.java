package com.twu.menu;

import com.twu.biblioteca.Book;
import com.twu.biblioteca.BookInventory;
import com.twu.models.TestConsoleInputReader;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ReturnOptionTest {

    @Test
    public void returnedBookShouldBeAddedTotheAvailableBookList() {
        BookInventory bookInventory = new BookInventory();
        String book = "The Alchemist\n";

        CheckOut checkOut = new CheckOut();
        TestConsoleInputReader inputReader = new TestConsoleInputReader(book);
        checkOut.executeMenuOption(bookInventory, inputReader);

        Return returnOption = new Return();
        TestConsoleInputReader inputReader1 = new TestConsoleInputReader(book);
        Book bookToBeReturned = new Book("The Alchemist", "Poulo coehlo", 1999);
        returnOption.executeMenuOption(bookInventory, inputReader1);

        assertTrue(bookInventory.getAvailableBooks().contains(bookToBeReturned));
    }

    @Test
    public void customerShouldBeAbleToReturnTheCheckedOutBook() {
        BookInventory bookInventory = new BookInventory();

        String book = "The Alchemist\n";
        CheckOut checkOut = new CheckOut();
        TestConsoleInputReader inputReader = new TestConsoleInputReader(book);
        checkOut.executeMenuOption(bookInventory, inputReader);

        Return returnOption = new Return();
        TestConsoleInputReader inputReader1 = new TestConsoleInputReader(book);
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Thank you for returning the book.");

        assertEquals(expectedResult, returnOption.executeMenuOption(bookInventory, inputReader1).getResponse());
    }

    @Test
    public void ShouldNotAcceptTheBookThatDoesnotBelongTtheRepository() {
        BookInventory bookInventory = new BookInventory();

        String checkedOutBook = "The Alchemist\n";
        CheckOut checkOut = new CheckOut();
        TestConsoleInputReader inputReader = new TestConsoleInputReader(checkedOutBook);
        checkOut.executeMenuOption(bookInventory, inputReader);

        String bookToBeReturned = "Some Other Book\n";
        Return returnOption = new Return();
        TestConsoleInputReader inputReader1 = new TestConsoleInputReader(bookToBeReturned);

        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("That is not a valid book to return.");

        assertEquals(expectedResult, returnOption.executeMenuOption(bookInventory, inputReader1).getResponse());
    }

    @Test
    public void shouldDisplayMenuOption() {
        Return returnOption = new Return();
        String expectedMenuOption = "Return";

        assertEquals(expectedMenuOption, returnOption.getMenuOption());
    }
}
