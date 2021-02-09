import org.junit.Before;
import org.junit.Test;

import java.lang.annotation.Target;

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

   @Test
    public void hasCapacity40(){
       assertEquals(40, bus.getCapacity());
   }

   @Test
    public void hasNoPassengers(){
       assertEquals(0, bus.getPassengers());
   }
}
