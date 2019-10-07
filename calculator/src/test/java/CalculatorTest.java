import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void add(){
    Calculator calculator = new Calculator(1, 1, 1.0, 2.0);
    assertEquals(2, calculator.add());
    }
    @Test
    public void subtract(){
    Calculator calculator = new Calculator(1, 1, 1.0, 2.0);
    assertEquals(0, calculator.subtract());
    }
    @Test
    public void multiply(){
    Calculator calculator = new Calculator(1, 1, 1.0, 2.0);
    assertEquals(1, calculator.multiply());

    }
    @Test
    public void divide(){
        Calculator calculator = new Calculator(1, 1, 1.0, 2.0);
        assertEquals(0.5, calculator.divide(), 0.01);
    }
}
