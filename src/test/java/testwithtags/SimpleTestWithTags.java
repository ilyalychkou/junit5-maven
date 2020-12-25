package testwithtags;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SimpleTestWithTags {

    @Test
    @Tag("Install")
    void testOneWithTag() {
        System.out.println("testOneWithTag");
        Assertions.assertTrue(1==2);
    }

    @Test
    @Tag("Smoke")
    void testTwoWithTag() {
        System.out.println("testTwoWithTag");
        Assertions.assertFalse(1==2);
    }

    @Test
    @Tag("Acceptance")
    void testThreeWithTag() {
        System.out.println("testThreeWithTag");
        String str1 = "Java";
        String str2 = "Java";
        Assertions.assertTrue(str1.equals(str2));
    }
}
