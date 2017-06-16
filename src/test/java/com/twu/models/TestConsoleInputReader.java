package com.twu.testModules;

import com.twu.inputReader.ConsoleInputReader;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

public class TestConsoleInputReader extends ConsoleInputReader {

    List<String> output = new ArrayList<>();
    public TestConsoleInputReader(BufferedReader bufferedReader) {
        super(bufferedReader);
    }

    public List<String> getOutput() {
        return output;
    }

}
