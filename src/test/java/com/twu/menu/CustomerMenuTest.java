package com.twu.menu;

import com.twu.models.TestConsoleOutputWriter;
import com.twu.models.TestCustomerMenu;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CustomerMenuTest {

    @Test
    public void shouldCallDisplayMethod() {
        TestCustomerMenu testCustomerMenu = new TestCustomerMenu(null);
        TestConsoleOutputWriter outputWriter = new TestConsoleOutputWriter();

        testCustomerMenu.displayMenu(outputWriter);

        assertTrue(testCustomerMenu.isDisplayMenuCalled());
    }

    @Test
    public void shouldCallGetMenuOptions() {
        TestCustomerMenu testCustomerMenu = new TestCustomerMenu(null);

        testCustomerMenu.getMenuOption("3\n");

        assertTrue(testCustomerMenu.isGetMenuOptionCalled());
    }
}
