package org.keldwar.consolebot.readers;

import org.keldwar.consolebot.Request;

import java.util.Scanner;

public class ConsoleReader implements Reader {
    @Override
    public Request read() {
        Scanner scanner = new Scanner(System.in);

        return new Request(scanner.nextLine());
    }


}
