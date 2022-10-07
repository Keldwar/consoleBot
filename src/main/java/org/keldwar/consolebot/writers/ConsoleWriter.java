package org.keldwar.consolebot.writers;

import org.keldwar.consolebot.Response;

public class ConsoleWriter implements Writer {

    @Override
    public void write(Response data) {
        System.out.println(data.data());
    }
}
