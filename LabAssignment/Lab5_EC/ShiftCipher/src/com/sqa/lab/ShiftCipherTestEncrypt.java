package com.sqa.lab;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ShiftCipherTest {

    @Test
    void testEncrypt() {
        ShiftCipher cipher = new ShiftCipher();
        String result = cipher.encrypt("HELLO", 3);
        assertEquals("KHOOR", result);
    }
}
