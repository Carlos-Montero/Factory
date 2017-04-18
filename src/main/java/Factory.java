/**
 * Created by Carlos on 08/03/2017.
 */
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import java.util.HashMap;

public class Factory {
    private static Factory ourInstance = new Factory();
    private HashMap<String, Command> cache;
    private static final Logger LOGGER = LogManager.getLogger(Factory.class);

    public static Factory getInstance() {
        return ourInstance;
    }

    private Factory() {
        this.cache = new HashMap<String, Command>();
    }

    public Command getCommand(String nomCmd) throws Exception {
        Command cmd = this.cache.get(nomCmd);
        if (cmd == null) {
            Class c = Class.forName(nomCmd);
            cmd = (Command) c.newInstance();
            this.cache.put(nomCmd, cmd);

            String debugStr =nomCmd;
            LOGGER.info(debugStr);
        }
        return cmd;
    }
}
