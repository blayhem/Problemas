import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by blayhem on 26/06/15.
 */

public class MyGroupTester {

    @Test
    public void myTests() {
        assertEquals(Groups.groupCheck("()"), true);
        assertEquals(Groups.groupCheck("({"), false);
    }
}



