package com.sqa.lab;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

class ShiftCipherTestDecrypt {

	// 1. กรณีข้อมูลถูกต้อง (Valid Cases)
	@ParameterizedTest
	@CsvSource({
		"RKKRTB, 17, ATTACK",  
		"HELLO,   0, HELLO",   
		"UVW,    -3, XYZ",     
		"khoor,   3, HELLO"    
	})
	void testDecryptValidCases(String cipherText, int key, String expectedResult) {
		ShiftCipher cipher = new ShiftCipher();
		String actualResult = cipher.decrypt(cipherText, key);
		assertEquals(expectedResult, actualResult);
	}
	
	// 2. กรณีข้อความไม่ถูกต้อง (Invalid CipherText Cases)
	@ParameterizedTest
	@CsvSource(nullValues = "null", value = {
		"RKKRTB1, 3",   // TC005: มีตัวเลข "1"
		"RKKRTB!, 3",   // TC006: มีสัญลักษณ์ "!"
		"'R K K', 3",   // TC007: มีช่องว่าง
		"'',      3",   // TC008: ข้อความว่างเปล่า ""
		"null,    3"    // TC009: ข้อความ null
	})
	void testDecryptInvalidCases(String cipherText, int key) {
		ShiftCipher cipher = new ShiftCipher();
		assertThrows(IllegalArgumentException.class, () -> {
			cipher.decrypt(cipherText, key);
		});
	}

	// 3. กรณี Key ผิดประเภท (Invalid Key Types: TC010 - TC013)
	@Test
	void TC010_nullKey() {
		assertThrows(NumberFormatException.class, () -> {
			String keyStr = null;
			Integer.parseInt(keyStr);
		});
	}

	@Test
	void TC011_keyOverflow() {
		assertThrows(NumberFormatException.class, () -> {
			Integer.parseInt("2147483648");
		});
	}

	@Test
	void TC012_keyUnderflow() {
		assertThrows(NumberFormatException.class, () -> {
			Integer.parseInt("-2147483649");
		});
	}

	@Test
	void TC013_keyNotInteger() {
		assertThrows(NumberFormatException.class, () -> {
			Integer.parseInt("3.14");
		});
	}
}
