package org.keldwar.consolebot;

import java.util.*;

public class ConsoleReader implements Reader {
    Wrapper data = new Wrapper();

    @Override
    public void read() {
        Scanner scanner = new Scanner(System.in);
        data.data = scanner.nextLine();
    }

    //is needed setter??
    @Override
    public Wrapper getData() {
        return data;
    }


}
