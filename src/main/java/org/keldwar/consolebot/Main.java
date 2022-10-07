package org.keldwar.consolebot;

import org.keldwar.consolebot.handlers.Handler;
import org.keldwar.consolebot.handlers.Handler1;
import org.keldwar.consolebot.readers.ConsoleReader;
import org.keldwar.consolebot.readers.Reader;
import org.keldwar.consolebot.writers.ConsoleWriter;
import org.keldwar.consolebot.writers.Writer;

public class Main {
    public static void main(String[] args) {
        Reader reader = new ConsoleReader();
        Writer writer = new ConsoleWriter();

        while (true) {
            Request request = reader.read();
            Handler handler = new Handler1();
            Response response = handler.returnResponse(request);
            writer.write(response);
        }
    }
}
