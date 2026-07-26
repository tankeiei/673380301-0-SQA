package com.sqa.lab;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

class CompetitionScoreTest {

	// 1. Valid Cases (ทดสอบทั้งแบบ 3 พารามิเตอร์ และแบบ อาร์เรย์ พร้อมกัน)
	@ParameterizedTest
	@CsvSource({
		"100, 250, 400, 400",  // TC001
		"  0,   0,   0,   0",  // TC002
		"500, 500, 500, 500",  // TC003
		"300, 450, 200, 450"   // TC004
	})
	void testFindMaxScoreValid(int score1, int score2, int score3, int expected) {
		CompetitionScore comp = new CompetitionScore();
		
		// ทดสอบแบบ 3 พารามิเตอร์ findMaxScore(score1, score2, score3)
		assertEquals(expected, comp.findMaxScore(score1, score2, score3));
		
		// ทดสอบแบบ อาร์เรย์ findMaxScore(int[] scores)
		assertEquals(expected, comp.findMaxScore(new int[]{score1, score2, score3}));
	}

	// 2. Invalid Score Cases: findMaxScore(int score1, int score2, int score3)
	@ParameterizedTest
	@CsvSource({
		"-10, 200, 300",  // TC005: score1 < 0
		"100,  -1, 400",  // TC006: score2 < 0
		"501, 200, 300",  // TC007: score1 > 500
		"100, 600, 400",  // TC008: score2 > 500
		" -5, 550, 300"   // TC013: score2 > 500 , score1 < 0
	})
	void testFindMaxScoreThreeParamsInvalid(int score1, int score2, int score3) {
		CompetitionScore comp = new CompetitionScore();
		assertThrows(IllegalArgumentException.class, () -> {
			comp.findMaxScore(score1, score2, score3);
		});
	}

	// 3. Invalid Array Cases: findMaxScore(int[] scores)
	@Test
	void TC009_arraySizeLessThan3() {
		CompetitionScore comp = new CompetitionScore();
		assertThrows(IllegalArgumentException.class, () -> {
			comp.findMaxScore(new int[]{100, 200});
		});
	}

	@Test
	void TC010_arraySizeGreaterThan3() {
		CompetitionScore comp = new CompetitionScore();
		assertThrows(IllegalArgumentException.class, () -> {
			comp.findMaxScore(new int[]{100, 200, 300, 400});
		});
	}

	@Test
	void TC011_emptyArray() {
		CompetitionScore comp = new CompetitionScore();
		assertThrows(IllegalArgumentException.class, () -> {
			comp.findMaxScore(new int[]{});
		});
	}

	@Test
	void TC012_nullArray() {
		CompetitionScore comp = new CompetitionScore();
		assertThrows(IllegalArgumentException.class, () -> {
			comp.findMaxScore((int[]) null);
		});
	}
}
