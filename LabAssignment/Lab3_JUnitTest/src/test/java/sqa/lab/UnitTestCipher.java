package sqa.lab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class UnitTestCipher {

    private final ShiftCipher cipher = new ShiftCipher();
    //TC01: message = "SOFTWARE", key = 3, expected result = "VRIWZDUH"
    @Test
    void TestValid1() {
       assertEquals("VRIWZDUH", cipher.shift("SOFTWARE", 3));
    }

    @Test
    void TestValid2() {
       assertEquals("vriwzduh", cipher.shift("software", 3));
    }


}
