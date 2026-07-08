package sqa.lab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class UnitTestCipher {

    private final ShiftCipher cipher = new ShiftCipher();
    //TC01: message = "SOFTWARE", key = 3, expected result = "VRIWZDUH"
    @Test
    void Test1() {
       assertEquals("VRIWZDUH", cipher.shift("SOFTWARE", 3));
    }

    @Test
    void Test2() {
       assertEquals("vriwzduh", cipher.shift("software", 3));
    }
    
    @Test
    void Test3() {
        assertEquals("TWFSLJ123", cipher.shift("ORANGE123", 5));
    }
    
    @Test
    void Test4() {
        assertEquals("TWFSLN", cipher.shift("Orangi", 3));
    }
    
    @Test
    void Test5() {
        assertEquals("GFSFSF", cipher.shift("BAnaNA", 5));
    }


}
