import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
   private Bus bus;

   @Before
    public void before(){
       bus = new Bus("Joppa");
   }

   @Test
    public void hasDestination(){
       assertEquals("Joppa", bus.getDestination());
   }
}
