package com.twu.menu;

import com.twu.models.TestConsoleOutputWriter;
import com.twu.models.TestLibrarianMenu;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LibrarianMenuTest {
    @Test
    public void shouldCallDisplayMethod() {
        TestLibrarianMenu testLibrarianMenu = new TestLibrarianMenu(null);
        TestConsoleOutputWriter outputWriter = new TestConsoleOutputWriter();

        testLibrarianMenu.displayMenu(outputWriter);

        assertTrue(testLibrarianMenu.isDisplayMenuCalled());
    }

    @Test
    public void shouldCallGetMenuOptions() {
        TestLibrarianMenu testLibrarianMenu = new TestLibrarianMenu(null);

        testLibrarianMenu.getMenuOption("3\n");

        assertTrue(testLibrarianMenu.isGetMenuOptionCalled());
    }
}
