package com.twu.menu;


import com.twu.biblioteca.Repository;
import com.twu.biblioteca.UserAuthentication;
import com.twu.inputReader.InputReader;
import com.twu.outputwriter.OutputWriter;

public class UserProfile implements MenuOptionProvider {

    UserAuthentication userAuthentication;

    public UserProfile(UserAuthentication userAuthentication) {
        this.userAuthentication = userAuthentication;
    }

    @Override
    public Response executeMenuOption(Repository repository, InputReader reader, OutputWriter writer) {
        return new Response(userAuthentication.getUser().toString());
    }
}
