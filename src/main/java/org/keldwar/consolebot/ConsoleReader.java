package org.keldwar.consolebot;
import java.util.*;

public class ConsoleReader implements Reader {
    String data;
    @Override
    public void read() {
       Scanner scanner = new Scanner(System.in);
       data = scanner.nextLine();
    }

    //is needed setter??
    public String getData() {
        return data;
    }
    //transfer to Handler??

    public static void main(String[] args) {
        Reader reader = new ConsoleReader();

        Writer writer = new ConsoleWriter();
        while (true) {
            reader.read();
            writer.write(reader.getData());
        }
    }
}
