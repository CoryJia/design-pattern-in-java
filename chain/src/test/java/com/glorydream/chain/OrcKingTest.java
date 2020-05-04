package com.glorydream.chain;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * @author coryjia@gmail.com
 * @date 5/3/20 4:48 PM
 */
public class OrcKingTest {
    /**
     * All possible requests
     */

    private static final List<Request> REQUESTS = List.of(
            new Request(RequestType.DEFEND_CASTLE, "Don't let the barbarians enter my castle!!"),
            new Request(RequestType.TORTURE_PRISONER, "Don't just stand there, tickle him!"),
            new Request(RequestType.COLLECT_TAX, "Don't steal, the King hates competition ...")
    );


    @Test
    public void testMakeRequest() {
        final var king = new OrcKing();

        REQUESTS.forEach(request -> {
            king.makeRequest(request);
            assertTrue(
                    request.isHandled(),
                    "Expected all requests from King to be handled, but [" + request + "] was not!"
            );
        });
    }

}
