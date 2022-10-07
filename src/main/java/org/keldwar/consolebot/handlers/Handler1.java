package org.keldwar.consolebot.handlers;

import org.keldwar.consolebot.Request;
import org.keldwar.consolebot.Response;

public class Handler1 implements Handler {
    public Response returnResponse(Request request) {
        return new Response(request.data());
    }
}
