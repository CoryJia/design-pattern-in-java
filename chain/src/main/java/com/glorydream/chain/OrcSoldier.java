package com.glorydream.chain;

/**
 * @author coryjia@gmail.com
 * @date 5/3/20 4:13 PM
 */
public class OrcSoldier extends RequestHandler{
    public OrcSoldier(RequestHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.COLLECT_TAX){
            printHandling(request);
            request.markHandled();
        }else {
            super.handleRequest(request);
        }
    }

    @Override
    public String toString() {
        return "Orc soldier";
    }
}
