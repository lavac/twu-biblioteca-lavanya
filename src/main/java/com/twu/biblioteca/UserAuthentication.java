package com.twu.biblioteca;

import java.util.LinkedHashMap;
import java.util.Map;

public class UserAuthentication {
    Map<User, Password> userInfoPasswordMap;

    UserAuthentication() {
        userInfoPasswordMap = new LinkedHashMap<>();
        addUser();
    }

    private void addUser() {
        userInfoPasswordMap.put(new User("cus-1234", "lav", "lav@g.com", "mysore", "234567"), new Password("lav"));
        userInfoPasswordMap.put(new User("cus-2345", "shar", "shar@g.com", "udupi", "232367"), new Password("shar"));
    }

    private User login(String libraryNumber, Password password) {
        for(Map.Entry<User, Password> info: userInfoPasswordMap.entrySet())
        {
            if(libraryNumber == info.getKey().getLibraryNumber() && password.equals(info.getValue()))
                return info.getKey();
        }
        return null;
    }
}
