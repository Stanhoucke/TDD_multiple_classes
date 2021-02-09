import org.junit.Before;
import org.junit.Test;

import java.lang.annotation.Target;

import static org.junit.Assert.assertEquals;

public class BusTest {
   private Bus bus;
   private Person person;
   private BusStop busStop;

   @Before
    public void before(){
       bus = new Bus("Joppa");
       person = new Person("Rick");
       busStop = new BusStop("Joppa");
       busStop.addToQueue(person);
       busStop.addToQueue(person);
       busStop.addToQueue(person);
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

   @Test
    public void canAddPassenger(){
       bus.addPassenger(person);
       assertEquals(1, bus.getPassengers());
   }

   @Test
    public void canRemovePassenger(){
       bus.addPassenger(person);
       bus.addPassenger(person);
       bus.removePassenger();
       assertEquals(1, bus.getPassengers());
   }

   @Test
   public void canPickUpFromBusStop(){
      bus.pickUp(busStop);
      assertEquals(1, bus.getPassengers());
      assertEquals(2, busStop.getQueue());
   }

}
