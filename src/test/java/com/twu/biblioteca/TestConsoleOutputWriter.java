package com.twu.biblioteca;

import com.twu.outputwriter.ConsoleOutputWriter;

import java.io.BufferedWriter;
import java.util.ArrayList;

public class TestConsoleOutputWriter extends ConsoleOutputWriter {

    ArrayList<String> output = new ArrayList<>();
    TestConsoleOutputWriter(BufferedWriter bufferedWriter) {
        super(bufferedWriter);
    }

    @Override
    public void write(String outputString) {
        output.add(outputString);
        }

        ArrayList<String> getOutput() {
            return output;
        }

}





