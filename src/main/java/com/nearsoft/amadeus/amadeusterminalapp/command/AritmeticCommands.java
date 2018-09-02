package com.nearsoft.amadeus.amadeusterminalapp.command;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class AritmeticCommands {

    @ShellMethod("Add two integers.")
    public int add(int a, int b) {
        return a + b;
    }

    @ShellMethod("Substrac two integers.")
    public int subtract(int a, int b) {
        return a - b;
    }
}
