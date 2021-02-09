import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person;
    private Bus bus;

    @Before
    public void before(){
        busStop = new BusStop("Joppa");
        person = new Person("Rick");
        bus = new Bus("Joppa");
    }

    @Test
    public void hasName(){
        assertEquals("Joppa", busStop.getName());
    }

    @Test
    public void hasEmptyQueue(){
        assertEquals(0, busStop.getQueue());
    }

    @Test
    public void canAddPersonToQueue(){
        busStop.addToQueue(person);
        assertEquals(1, busStop.getQueue());
    }
    
    @Test
    public void canRemovePersonFromQueue(){
        busStop.addToQueue(person);
        busStop.addToQueue(person);
        busStop.removeFromQueue();
        assertEquals(1, busStop.getQueue());

    }
}
