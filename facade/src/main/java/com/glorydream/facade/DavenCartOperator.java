package com.glorydream.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author coryjia@gmail.com
 * @date 4/29/20 12:15 AM
 */
public class DavenCartOperator extends DavenMineWorker {

    public static final Logger LOGGER = LoggerFactory.getLogger(DavenCartOperator.class);

    @Override
    public void work() {
        LOGGER.info("{} moves gold chunks out of the mine.", name());
    }

    @Override
    public String name() {
        return "Dwarf cart operator";
    }
}
