package org.keldwar.consolebot;

public class ConsoleWriter implements Writer {

    @Override
    public void write(Wrapper data) {
        System.out.println(data.data);
    }
}
