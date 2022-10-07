package org.keldwar.consolebot.writers;

import org.keldwar.consolebot.dto.Response;

public class ConsoleWriter implements Writer {
    @Override
    public void write(Response response) {
        System.out.println(response.data());
    }
}
