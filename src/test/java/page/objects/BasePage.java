package page.objects;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BasePage {

    private Logger logger = LogManager.getLogger(this.getClass().getName());

    public  Logger log() {
        return logger;
    }
}