package com.twu.models;


import com.twu.inputReader.InputReader;

public class TestConsoleInputReader implements InputReader {
    private String[] input;
    private int noOfIterations = 0;

    public TestConsoleInputReader(String inputString) {
        input = inputString.split("\n");
    }

    @Override
    public String read() {
        return input[noOfIterations++];
    }

    public int getNumberOfIterations() {
        return noOfIterations;
    }

}
