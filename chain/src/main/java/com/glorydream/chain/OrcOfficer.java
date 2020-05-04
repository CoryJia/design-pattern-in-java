package com.glorydream.chain;

/**
 * @author coryjia@gmail.com
 * @date 5/3/20 4:16 PM
 */
public class OrcOfficer extends RequestHandler {
    public OrcOfficer(RequestHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.TORTURE_PRISONER){
            printHandling(request);
            request.markHandled();
        }else {
            super.handleRequest(request);
        }
    }

    @Override
    public String toString() {
        return "Orc officer";
    }
}
