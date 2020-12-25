import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleJunit5Test {

    @Test
    void testOne() {
        Assertions.assertTrue(1==1);
    }

    @Test
    void testTwo() {
        Assertions.assertFalse(1==2);
    }
}
