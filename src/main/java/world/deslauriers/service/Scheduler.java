package world.deslauriers.service;

import io.micronaut.scheduling.annotation.Scheduled;
import jakarta.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class Scheduler {

    private static final Logger log = LoggerFactory.getLogger(Scheduler.class);
    private final TasktypeService tasktypeService;

    public Scheduler(TasktypeService tasktypeService) {
        this.tasktypeService = tasktypeService;
    }

    @Scheduled(cron = "0 0 4 * * *")
//    @Scheduled(fixedDelay = "15s")
    void dailyTasks(){

        log.info("Daily tasks created.");
        tasktypeService.createDailyTasks().subscribe();
    }
}
