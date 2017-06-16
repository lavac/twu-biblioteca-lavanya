package com.twu.biblioteca.inputReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class ConsoleInputReader implements InputReader {

        private BufferedReader bufferedReader;

        public ConsoleInputReader(BufferedReader bufferedReader) {
            this.bufferedReader = bufferedReader;
        }

        @Override
        public String read() {
            String line = "";
            try {
                 line = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return line;
        }
}
