package com.glorydream.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author coryjia@gmail.com
 * @date 4/29/20 12:16 AM
 */
public class DavenTunnelDigger extends DavenMineWorker{
    public static final Logger LOGGER = LoggerFactory.getLogger(DavenTunnelDigger.class);
    @Override
    public void work() {
        LOGGER.info("{} creates another promising tunnel.", name());
    }

    @Override
    public String name() {
        return "Dwarf tunnel digger";
    }
}
