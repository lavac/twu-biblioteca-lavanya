package com.twu.models;

import com.twu.menu.Response;
import com.twu.outputwriter.OutputWriter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestConsoleOutputWriter implements OutputWriter {
    private List<String> output;

    public TestConsoleOutputWriter() {
        output = new ArrayList<>();
    }

    @Override
    public void write(Response responseString) {
        for (String out : responseString.getResponse())
            output.add(out);
    }

}





