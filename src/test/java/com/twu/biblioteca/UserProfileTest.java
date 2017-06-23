package com.twu.biblioteca;

import com.twu.menu.Response;
import com.twu.menu.UserProfile;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserProfileTest {

    @Test
    public void shouldDisplayUserProfile() {
        User user = new User("cus-1234", "lav", "lav@g.com", "mysore", "234567", false);

        UserAuthentication userAuthentication = new UserAuthentication();
        userAuthentication.setUser(user);
        UserProfile userProfile = new UserProfile(userAuthentication);
        Response expectedResponse = new Response("Name :lav\nEmail Id : lav@g.com\nAddress : mysore\nPhone No : 234567\n");

        Response response = userProfile.executeMenuOption(null, null, null);

        assertEquals(expectedResponse.getResponse(), response.getResponse());
    }
}
