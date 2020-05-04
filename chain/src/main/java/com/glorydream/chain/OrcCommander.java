package com.glorydream.chain;

/**
 * @author coryjia@gmail.com
 * @date 5/3/20 4:18 PM
 */
public class OrcCommander extends RequestHandler {
    public OrcCommander(RequestHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.DEFEND_CASTLE){
            printHandling(request);
            request.markHandled();
        }else {
            super.handleRequest(request);
        }
    }

    @Override
    public String toString() {
        return "Orc commander";
    }
}
