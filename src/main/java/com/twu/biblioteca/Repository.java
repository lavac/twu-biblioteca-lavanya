package com.twu.biblioteca;

import com.twu.menu.Response;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Repository {

    private Map<LibraryItem, User> checkedOutItems;
    private List<LibraryItem> availableItems;
    private List<Item> list;
    UserAuthentication userAuthentication;

    public Repository(UserAuthentication userAuthentication) {
        this.userAuthentication = userAuthentication;
        checkedOutItems = new LinkedHashMap<>();
        availableItems = new ArrayList<>();
        makeRepository();
    }

    private void makeRepository() {
        availableItems.add(new LibraryItem(new Book("2 States", "Chetan Bhagat", 2009), "book"));
        availableItems.add(new LibraryItem(new Book("The Alchemist", "Poulo coehlo", 1999), "book"));
        availableItems.add(new LibraryItem(new Book("Five point someone", "Chetan Bhagat", 2012), "book"));
        availableItems.add(new LibraryItem(new Movie("Money ball", "Bennett Miller", 2011, 4), "movie"));
        availableItems.add(new LibraryItem(new Movie("The Pursuit of Happyness", "Gabriele Muccino", 2006, 5), "movie"));
        availableItems.add(new LibraryItem(new Movie("Crazy, Stupid, Love.", "Glenn Ficarra", 2011, 3), "movie"));
    }

    public Response checkOutItem(String itemName, String type) {
        for (LibraryItem libraryItem : availableItems)
            if ((libraryItem.getItem().getName().equals(itemName)) && libraryItem.getType().equals(type)) {
                availableItems.remove(libraryItem);
                addToCheckedOutList(libraryItem, userAuthentication.getUser());
                return new Response("Thank you! Enjoy the " + type + "!\n");
            }
        return new Response("That " + type + " is not available!\n");
    }

    private void addToCheckedOutList(LibraryItem libraryItem, User user) {
        checkedOutItems.put(libraryItem, user);
    }

    public List<Item> getItems(String type) {
        list = new ArrayList<>();
        for (LibraryItem libraryItem : availableItems) {
            if (type.equals(libraryItem.getType()))
                list.add(libraryItem.getItem());
        }
        return list;
    }

    public Response returnItem(String itemName, String type) {
        for (Map.Entry<LibraryItem, User> entry : checkedOutItems.entrySet()) {
            if (itemName.equals(entry.getKey().getItem().getName())) {
                checkedOutItems.remove(entry.getKey());
                availableItems.add(entry.getKey());
                return new Response("Thank you for returning the " + type + "!\n");
            }
        }
        return new Response("That is not a valid " + type + " to return!\n");
    }

    public Map<Item, User> getCheckedOutItems(String type) {
        Map<Item, User> items = new LinkedHashMap<>();
        for (Map.Entry<LibraryItem, User> entry : checkedOutItems.entrySet()) {
            if (type.equals(entry.getKey().getType())) {
                items.put(entry.getKey().getItem(), entry.getValue());
            }
        }
        return items;
    }
}
