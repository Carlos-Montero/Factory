/**
 * Created by Carlos on 12/03/2017.
 */
import static org.junit.Assert.*;

public class FactoryTest {

    @org.junit.Test
    public void tryC1() throws Exception{
        Factory.getInstance().getCommand("C1").doSomething();
    }

    @org.junit.Test
    public void tryC1_2() throws Exception{
        Factory.getInstance().getCommand("C1").doSomething();
    }

    @org.junit.Test
    public void tryC2() throws Exception{
        Factory.getInstance().getCommand("C2").doSomething();
    }

    @org.junit.Test
    public void tryC3() throws Exception{
        Factory.getInstance().getCommand("C3").doSomething();
    }

    @org.junit.Test (expected = ClassNotFoundException.class)
    public void tryC4() throws Exception{
        Factory.getInstance().getCommand("C4").doSomething();
    }
}
