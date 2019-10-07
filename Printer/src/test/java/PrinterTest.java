import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
    public void setUp(){
        printer = new Printer(100, 50);
    }

    @Test
    public void getPaper(){
     assertEquals(100, printer.getPaper());
    }

    @Test
    public void canPrint(){
     assertEquals(99, printer.canPrint());
    }

    @Test
    public void hasToner(){

    }

    @Test
    public void reduceToner(){

    }
}
