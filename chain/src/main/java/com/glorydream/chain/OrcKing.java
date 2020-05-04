package com.glorydream.chain;

/**
 * @author coryjia@gmail.com
 * @date 5/3/20 4:19 PM
 */
public class OrcKing {
    private RequestHandler chain;

    public OrcKing() {
        buildChain();
    }

    public void buildChain(){
        chain = new OrcCommander(new OrcOfficer(new OrcSoldier(null)));
    }

    public void makeRequest(Request request){
        chain.handleRequest(request);
    }
}
