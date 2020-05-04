package com.glorydream.chain;

/**
 * @author coryjia@gmail.com
 * @date 5/3/20 4:26 PM
 *
 *
 */
public class APP {
    public static void main(String[] args) {
        OrcKing king = new OrcKing();

        king.makeRequest(new Request(RequestType.DEFEND_CASTLE, "defend castle"));
        king.makeRequest(new Request(RequestType.TORTURE_PRISONER, "torture prisoner"));
        king.makeRequest(new Request(RequestType.COLLECT_TAX, "collect tax"));
    }
}
