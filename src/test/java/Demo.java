import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by P0093203 on 2017/3/22.
 */
public class Demo {
    private static Logger log = LoggerFactory.getLogger(Demo.class);
    public static void main(String[] args) {
        log.trace("======trace");
        log.debug("======debug");
        log.info("======info");
        log.warn("======warn");
        log.error("======error");
    }

}