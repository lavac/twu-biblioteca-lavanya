package com.twu.testModules;

import com.twu.outputwriter.ConsoleOutputWriter;

import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.List;

public class TestConsoleOutputWriter extends ConsoleOutputWriter {

    List<String> output = new ArrayList<>();
    public TestConsoleOutputWriter(BufferedWriter bufferedWriter) {
        super(bufferedWriter);
    }

    @Override
    public void write(String outputString) {
        output.add(outputString);
        }

        public List<String> getOutput() {
            return output;
        }

}





