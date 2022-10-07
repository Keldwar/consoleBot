package org.keldwar.consolebot;

import org.keldwar.consolebot.dto.Request;
import org.keldwar.consolebot.dto.Response;
import org.keldwar.consolebot.handlers.Handler;
import org.keldwar.consolebot.handlers.SimpleHandler;
import org.keldwar.consolebot.readers.ConsoleReader;
import org.keldwar.consolebot.readers.Reader;
import org.keldwar.consolebot.writers.ConsoleWriter;
import org.keldwar.consolebot.writers.Writer;

public class Main {
    public static void main(String[] args) {
        Reader reader = new ConsoleReader();
        Writer writer = new ConsoleWriter();
        Handler handler = new SimpleHandler();

        while (true) {
            Request request = reader.read();
            if (request.data().isEmpty()) {
                break;
            }
            Response response = handler.returnResponse(request);
            writer.write(response);
        }
    }
}
