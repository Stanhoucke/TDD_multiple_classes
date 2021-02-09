import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    private Person person;

    @Before
    public void before(){
        person = new Person("Rick");
    }
    @Test
    public void hasName(){
        assertEquals("Rick", person.getName());
    }
}
