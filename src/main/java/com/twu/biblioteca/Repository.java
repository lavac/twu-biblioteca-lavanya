package com.twu.biblioteca;


import com.twu.constants.Status;
import com.twu.menu.Response;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static com.twu.constants.Constants.*;
import static com.twu.constants.Status.AVAILABLE;
import static com.twu.constants.Status.CHECKEDOUT;

public class Repository {
    private Map<Item, Status> repository;
    private List<Item> availableItems;
    private List<Item> items;

    public Repository() {
        repository = new LinkedHashMap<>();
        items = new ArrayList<>();
        makeRepository();
        makeAListOfMovies();
    }

    private void makeRepository() {
        repository.put(new Book("2 States", "Chetan Bhagat", 2009), AVAILABLE);
        repository.put(new Book("The Alchemist", "Poulo coehlo", 1999), AVAILABLE);
        repository.put(new Book("Five point someone", "Chetan Bhagat", 2012), AVAILABLE);
    }

    private void makeAListOfMovies() {
        for (Map.Entry<Item, Status> entry : repository.entrySet())
            items.add(entry.getKey());
    }

    List<Item> getAllItems() {
        return items;
    }



    public List<Item> getAvailableItems() {
        availableItems = new ArrayList<>();
        for (Map.Entry<Item, Status> entry : repository.entrySet()) {
            if (AVAILABLE == entry.getValue()) {
                availableItems.add(entry.getKey());
            }
        }
        return availableItems;
    }


    public Response checkOutItem(String bookName) {
        for (Item movie : getAvailableItems()) {
            if (movie.getName().equals(bookName)) {
                setAvailabilityStatus(bookName, CHECKEDOUT);
                return new Response(CHECK_OUT_SUCCESS_MESSAGE);
            }
        }
        return new Response(CHECK_OUT_FAILURE_MESSAGE);
    }


    public Response returnItem(String bookName) {
        for (Map.Entry<Item, Status> entry : repository.entrySet()) {
            if (bookName.equals(entry.getKey().getName()) && entry.getValue() == CHECKEDOUT) {
                setAvailabilityStatus(bookName, AVAILABLE);
                return new Response(RETURN_SUCCESS_MESSAGE);
            }
        }
        return new Response(RETURN_FAILURE_MESSAGE);
    }

    private void setAvailabilityStatus(String bookName, Status status) {
        for (Map.Entry<Item, Status> entry : repository.entrySet()) {
            if (bookName.equals(entry.getKey().getName())) {
                entry.setValue(status);
            }
        }
    }
}
