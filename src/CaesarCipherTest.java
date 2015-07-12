/**
 * Created by blayhem on 12/07/15.
 */
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class CaesarCipherTest {

    @Test
    public void test1() {
        String u = "I should have known that you would have a perfect answer for me!!!";

        System.out.println(u.length());
        System.out.printf("Expected: " + "J vltasl rlhr ".length() + " x4, ");
        System.out.println("  lvz wp!!!".length() + " x1");
        System.out.printf("Got: " + "J vltasl rlhr zd".length() + " x4, ");
        System.out.println(" !!".length() + " x1");
        System.out.printf("J vltasl rlhr zdfog odxr ypw atasl rlhr p gwkzzyq zntyhv lvz wp!!!".length() + " ");
        System.out.println("vs. " + "J vltasl rlhr zdfog odxr ypw atasl rlhr p gwkzzyq zntyhv lvz wp!!!".length());
        
        List<String> v = Arrays.asList("J vltasl rlhr ", "zdfog odxr ypw", " atasl rlhr p ", "gwkzzyq zntyhv", " lvz wp!!!");
        assertEquals(v, CaesarCipher.movingShift(u, 1));
        assertEquals(u, CaesarCipher.demovingShift(CaesarCipher.movingShift(u, 1), 1));
    }
}
