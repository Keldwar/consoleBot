package org.keldwar.consolebot;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Reader reader = new ConsoleReader();
            reader.read();
            Writer writer = new ConsoleWriter();
            writer.write(reader.getData());
        }
    }
}
