package com.scheduler.example;

import io.micronaut.scheduling.annotation.Scheduled;
import jakarta.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class SchedulerTest {
    private static final Logger logger = LoggerFactory.getLogger(SchedulerTest.class);

    @Scheduled(cron = "0 0 * * * *")
    public void scheduledTaskToRunTopEveryHourEveryDay() {
        logger.info("Scheduled task to run top every hour of every day");
    }

    @Scheduled(cron = "*/10 * * * * *")
    public void scheduledTaskToRunEachTenSecods() {
        logger.info("Scheduled task to run every ten seconds of every day");
    }

    @Scheduled(cron = "0 0/30 8-17 * * *")
    public void scheduledTaskToEveryThirtyMinutesOfEightTilSeventeen() {
        logger.info("Scheduled task to run every ten seconds of every day");
    }

    @Scheduled(cron = "0 0 9-18 * * MON-FRI")
    public void scheduledTaskTopHourOfNineTilEighteen() {
        logger.info("Scheduled task to run top hour of nine until eighteen.");
    }
}
