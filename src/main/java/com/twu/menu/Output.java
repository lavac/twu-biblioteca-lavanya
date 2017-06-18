package com.twu.menu;


import java.util.ArrayList;
import java.util.List;

public class Output {
    List<String> output;

    public Output(List<String> output) {
        this.output = output;
    }

    public Output(String output){
        this.output = new ArrayList<>();
        this.output.add(output);
    }

    public List<String> getOutput() {
        return output;
    }
}
