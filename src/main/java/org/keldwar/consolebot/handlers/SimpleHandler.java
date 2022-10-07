package org.keldwar.consolebot.handlers;

import org.keldwar.consolebot.dto.Request;
import org.keldwar.consolebot.dto.Response;

public class SimpleHandler implements Handler {
    public Response returnResponse(Request request) {
        return new Response(request.data());
    }
}
