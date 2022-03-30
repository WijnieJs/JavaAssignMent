
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {


    @Test
    void myFirstUnitTest() {
        Person person = new Person();
        person.setName("Wijnie");

        assertEquals("Wijnie", person.getName());
    }
}
