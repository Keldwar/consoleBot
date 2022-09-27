package org.keldwar.consolebot;

import java.util.*;

public class ConsoleReader implements Reader {
    StringWrapper data = new StringWrapper();

    @Override
    public void read() {
        Scanner scanner = new Scanner(System.in);
        data.setString(scanner.nextLine());
    }

    //is needed setter??
    @Override
    public StringWrapper getData() {
        return data;
    }

    public static void main(String[] args) {
        Reader reader = new ConsoleReader();

        Writer writer = new ConsoleWriter();
        while (true) {
            reader.read();
            writer.write(reader.getData());
        }
    }
}
