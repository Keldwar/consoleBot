package org.keldwar.consolebot;

public class ConsoleWriter implements Writer {

    @Override
    public void write(StringWrapper data) {
        System.out.println(data.getString());
    }
}
