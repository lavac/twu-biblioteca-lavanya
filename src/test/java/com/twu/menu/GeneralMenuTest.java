package com.twu.menu;

import com.twu.models.TestConsoleOutputWriter;
import com.twu.models.TestCustomerMenu;
import com.twu.models.TestGeneralMenu;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneralMenuTest {

    @Test
    public void shouldCallDisplayMethod() {
        TestGeneralMenu TestGeneralMenu = new TestGeneralMenu(null);
        TestConsoleOutputWriter outputWriter = new TestConsoleOutputWriter();

        TestGeneralMenu.displayMenu(outputWriter);

        assertTrue(TestGeneralMenu.isDisplayMenuCalled());
    }

    @Test
    public void shouldCallGetMenuOptions() {
        TestGeneralMenu TestGeneralMenu = new TestGeneralMenu(null);

        TestGeneralMenu.getMenuOption("3\n");

        assertTrue(TestGeneralMenu.isGetMenuOptionCalled());
    }
}
