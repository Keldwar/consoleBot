package org.keldwar.consolebot.handlers;

import org.keldwar.consolebot.dto.Request;
import org.keldwar.consolebot.dto.Response;

public interface Handler {
    Response returnResponse(Request request);
}
