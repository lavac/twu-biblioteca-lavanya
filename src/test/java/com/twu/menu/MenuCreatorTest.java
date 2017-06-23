package com.twu.menu;

import com.twu.biblioteca.Repository;
import com.twu.biblioteca.UserAuthentication;
import com.twu.models.TestMenuCreator;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MenuCreatorTest {

    @Test
    public void shouldGetMenu() {
        UserAuthentication userAuthentication = new UserAuthentication();
        Repository repository = new Repository(userAuthentication);
        TestMenuCreator testMenuCreator = new TestMenuCreator(repository, userAuthentication);

        testMenuCreator.getMenu();

        assertTrue(testMenuCreator.isGetMenuCalled());
    }
}
