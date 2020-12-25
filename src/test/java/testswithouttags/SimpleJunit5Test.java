package testswithouttags;

import io.github.artsok.RepeatedIfExceptionsTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class SimpleJunit5Test {

    @RepeatedIfExceptionsTest(repeats = 3, name = "Retry failed test. Attempt {currentRepetition} of {totalRepetitions}")
    void testOne() {
        System.out.println("testOne");
        Assertions.assertTrue(1==2);
    }

    @Test
    void testTwo() {
        Assertions.assertFalse(1==2);
    }
}
