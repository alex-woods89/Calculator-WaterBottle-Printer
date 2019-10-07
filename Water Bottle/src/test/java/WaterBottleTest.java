import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WaterBottleTest {

    @Test
    public void getVolume(){
      WaterBottle waterBottle = new WaterBottle(100);
      assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void takeDrink(){
        WaterBottle waterBottle = new WaterBottle(100);
        assertEquals(90, waterBottle.takeDrink());
    }

    @Test
    public void emptyBottle(){
        WaterBottle waterBottle = new WaterBottle(100);
        assertEquals(0, waterBottle.emptyBottle());
    }

    @Test
    public void fillBottle(){
        WaterBottle waterBottle = new WaterBottle(100);
        waterBottle.emptyBottle();
        waterBottle.fillBottle();
        assertEquals(100, waterBottle.getVolume());
    }
}
