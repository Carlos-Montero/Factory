/**
 * Created by Carlos on 12/03/2017.
 */
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args){

    try {
        Factory.getInstance().getCommand("C1").doSomething();
        Factory.getInstance().getCommand("C1").doSomething();
        Factory.getInstance().getCommand("C1").doSomething();
        Factory.getInstance().getCommand("C2").doSomething();
        Factory.getInstance().getCommand("C3").doSomething();
        Factory.getInstance().getCommand("C3").doSomething();
        Factory.getInstance().getCommand("C3").doSomething();

    }

    catch(Exception ex){
        LOGGER.fatal("Exception foound:", ex);
    }
    }
}
