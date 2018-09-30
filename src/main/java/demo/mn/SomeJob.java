package demo.mn;

import javax.inject.Singleton;
import io.micronaut.scheduling.annotation.Scheduled;

@Singleton
public class SomeJob {

    @Scheduled(fixedRate = "5m")
    public void process() {}
}