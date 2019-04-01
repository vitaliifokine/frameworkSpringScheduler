package Application;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ComponentApp {

    private static final Logger log = LoggerFactory.getLogger(ComponentApp.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 4000)
    public void reportCurrentTime() {
            log.info("Voodya {}", dateFormat.format(new Date()));
    }
}
