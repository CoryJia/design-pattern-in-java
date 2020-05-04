package com.glorydream.facade;

import java.util.List;

/**
 * @author coryjia@gmail.com
 * @date 4/29/20 12:17 AM
 *
 * DavenGoldMineFacade provides a single interface through which users can operate the subsystems.
 *
 * This makes the goldmine easier to operate and cuts teh dependencies from the goldmine user the subsystems
 */
public class DavenGoldmineFacade {
    private final List<DavenMineWorker> workers;

    public DavenGoldmineFacade() {
        workers = List.of(
                new DavenCartOperator(),
                new DavenGoldDigger(),
                new DavenTunnelDigger()
        );
    }

    /**
     * Dwarf gold digger wakes up and got to the mine.
     * Dwarf cart operator wakes up and got to the mine
     * Dwarf tunnel digger wakes up and go to the mine
     * */
    public void startNewDay(){
        makeActions(workers, DavenMineWorker.Action.WAKE_UP, DavenMineWorker.Action.GO_TO_MINE);
    }

    /**
     * Dwarf gold digger digs for the gold
     * Dwarf cart operator moves gold chunks out of the tunnel
     * Dwarf tunnel digger create another promising tunnel
     * */
    public void digOutGold(){
        makeActions(workers, DavenMineWorker.Action.WORK);
    }

    /**
     * Dwarf gold digger goes home and go to sleep.
     * Dwarf cart operator goes home and go to sleep.
     * Dwarf tunnel digger goes home and go to sleep.
     * */
    public void endDay(){makeActions(workers, DavenMineWorker.Action.GO_HOME, DavenMineWorker.Action.GO_TO_SLEEP);}

    private void makeActions(List<DavenMineWorker> workers, DavenMineWorker.Action... actions) {
        workers.forEach(worker -> worker.action(actions));
    }
}
