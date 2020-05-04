package com.glorydream.facade;

/**
 * @author coryjia@gmail.com
 * @date 4/29/20 12:12 AM
 *
 * The facade design pattern is often used when a system is very complex or difficult to understand
 * because the system has a large number of interdependent classes or its source code is
 * unavailable. This pattern hids the complexities of the large system and provides a simpler
 * interface to the client. It typically involves a single wrapper class which contains a set of
 * members required by clients. These members access the system on behalf of the facade client
 * and hide the implementation details.
 *
 */
public class App {
    public static void main(String[] args) {
        var facade = new DavenGoldmineFacade();
        facade.startNewDay();
        facade.digOutGold();
        facade.endDay();
    }
}
