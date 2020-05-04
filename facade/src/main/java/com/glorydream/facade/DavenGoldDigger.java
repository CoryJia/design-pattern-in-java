package com.glorydream.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author coryjia@gmail.com
 * @date 4/29/20 12:16 AM
 */
public class DavenGoldDigger extends DavenMineWorker {
    public static final Logger LOGGER = LoggerFactory.getLogger(DavenGoldDigger.class);


    @Override
    public void work() {
        LOGGER.info("{} digs for gold.", name());
    }

    @Override
    public String name() {
        return "Dwarf gold digger";
    }

    public static void main(String[] args) {
        var digger = new DavenGoldDigger();

        digger.wakeUp();
    }
}
