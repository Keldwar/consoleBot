package org.keldwar.consolebot.handlers;

import org.keldwar.consolebot.Request;
import org.keldwar.consolebot.Response;

public interface Handler {
    Response returnResponse(Request request);
}
