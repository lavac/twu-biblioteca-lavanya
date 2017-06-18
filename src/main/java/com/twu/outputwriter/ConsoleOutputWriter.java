package com.twu.outputwriter;

import com.twu.menu.Response;

import java.io.BufferedWriter;
import java.io.IOException;

public class ConsoleOutputWriter implements OutputWriter {
    private final BufferedWriter bufferedWriter;

    public ConsoleOutputWriter(BufferedWriter bufferedWriter) {
        this.bufferedWriter = bufferedWriter;
    }

    @Override
    public void write(Response responseMessages) {
        try {
            for(String output : responseMessages.getResponse())
                bufferedWriter.write(output + "\n");
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
