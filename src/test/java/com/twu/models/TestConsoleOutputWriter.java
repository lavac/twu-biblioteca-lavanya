package com.twu.models;

import com.twu.menu.Output;
import com.twu.outputwriter.OutputWriter;

import java.util.ArrayList;
import java.util.List;

public class TestConsoleOutputWriter implements OutputWriter {

    private List<String> output;

    public TestConsoleOutputWriter() {
        output = new ArrayList<>();
    }

    @Override
    public void write(Output outputString) {
        for(String out : outputString.getOutput())
        output.add(out);
    }

    public List<String> getOutput() {
        return output;
    }
}





