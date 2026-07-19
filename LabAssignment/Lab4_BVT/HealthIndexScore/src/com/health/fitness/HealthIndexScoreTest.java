package com.health.fitness;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HealthIndexScoreTest {

	@Test
	void testTC001() {

        HealthIndexScore health = new HealthIndexScore(0, 73, 15);
        

        assertEquals(6, health.getTotalScore(), "TC001: คะแนนรวมต้องได้ 6");
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, health.getFitnessLevel());
    }

}
