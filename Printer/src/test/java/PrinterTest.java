import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
    public void setUp(){
        printer = new Printer(100, 50, 20);
    }

    @Test
    public void getPaper(){
     assertEquals(100, printer.getPaper());
    }

    @Test
    public void reducePaper(){
     assertEquals(80, printer.reducePaper());
    }

    @Test
    public void checkPaper(){
     assertEquals("You have enough paper", printer.checkPaper());
    }

    @Test
    public void hasToner(){
     assertEquals(50, printer.getToner());
    }

    @Test
    public void reduceToner(){
     assertEquals(30, printer.reduceToner());
    }

    @Test
    public void print(){
        assertEquals(80, printer.reducePaper());
        assertEquals(30, printer.reduceToner());
        assertEquals(0, printer.printCopies());
    }

}
