package org.keldwar.consolebot;

public class ConsoleWriter implements Writer {
    public void write(String data) {
        System.out.println(data);
    }
}
