package com.twu.biblioteca;

import com.twu.inputReader.InputReader;
import com.twu.outputwriter.ConsoleOutputWriter;
import com.twu.inputReader.ConsoleInputReader;
import com.twu.outputwriter.OutputWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Application {
    public static void main(String[] args) {
        OutputWriter outputWriter = new ConsoleOutputWriter(new BufferedWriter(
                new OutputStreamWriter(System.out)));
        InputReader inputReader = new ConsoleInputReader(new BufferedReader
                                                                 (new InputStreamReader(System.in)));
        UserAuthentication userAuthentication = new UserAuthentication();
        new Biblioteca(inputReader, outputWriter, userAuthentication).start();
    }
}


