package com.twu.menu;

import java.util.ArrayList;
import java.util.List;

public class Response {
    private List<String> response;

    public Response(List<String> response) {
        this.response = response;
    }

    public Response(String response) {
        this.response = new ArrayList<>();
        this.response.add(response);
    }

    public List<String> getResponse() {
        return response;
    }
}
