package com.twu.inputReader;

import java.io.BufferedReader;
import java.io.IOException;

public class ConsoleInputReader implements InputReader {
    private BufferedReader bufferedReader = null;

    public ConsoleInputReader(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    @Override
    public String read() {
        String line = null;
        try {
            line = bufferedReader.readLine();
        } catch (IOException e) {
        }
        return line;
    }
}
