package com.twu.menu;

import com.twu.biblioteca.Repository;
import com.twu.biblioteca.UserAuthentication;
import com.twu.outputwriter.OutputWriter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerMenu extends MenuProvider {
    private List<String> menu;
    private Map<String, MenuOptionProvider> CustomerMenuOptions = null;
    Repository repository;
    UserAuthentication userAuthentication;

    public CustomerMenu(Repository repository, UserAuthentication userAuthentication) {
        this.userAuthentication = userAuthentication;
        this.repository = repository;
        CustomerMenuOptions = new HashMap<>();
        menu = new ArrayList<>();
        CustomerMenuOptions();
        makeCustomerMenu();
    }

    private void CustomerMenuOptions() {
        menu.add("1 : Profile");
        menu.add("2 : List Books");
        menu.add("3 : List Movies");
        menu.add("4 : Check out book");
        menu.add("5 : Check out movie");
        menu.add("6 : Return book");
        menu.add("7 : Return movie");
        menu.add("8 : log out");
        menu.add("q : quit");
    }

    private void makeCustomerMenu() {
        CustomerMenuOptions.put("1", new UserProfile(userAuthentication));
        CustomerMenuOptions.put("2", new ListItems("book"));
        CustomerMenuOptions.put("3", new ListItems("movie"));
        CustomerMenuOptions.put("4", new CheckOutItem("book"));
        CustomerMenuOptions.put("5", new CheckOutItem("movie"));
        CustomerMenuOptions.put("6", new ReturnItem("book"));
        CustomerMenuOptions.put("7", new ReturnItem("movie"));
        CustomerMenuOptions.put("8", new Logout(userAuthentication));
        CustomerMenuOptions.put("q", new Quit());
    }

    public void displayMenu(OutputWriter writer) {
        super.displayMenu(writer, menu);
    }

    public MenuOptionProvider getMenuOption(String userInput) {
        return super.getMenuOption(userInput, CustomerMenuOptions);
    }
}
