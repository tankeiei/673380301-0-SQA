package com.health.fitness;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HealthIndexScoreTest {

	@Test
	void testTC001() {
        HealthIndexScore health = new HealthIndexScore(0, 73, 15);
        assertEquals(6, health.getTotalScore(), "TC001: Expected 8");
    }
	
	@Test
	void testTC002() {
        HealthIndexScore health = new HealthIndexScore(1, 73, 15);
        assertEquals(6, health.getTotalScore(), "TC002: Expected  8");
    }
	
	@Test
    void testTC003() {
        HealthIndexScore health = new HealthIndexScore(35, 73, 15);
        assertEquals(8, health.getTotalScore(), "TC003: Expected  8");
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, health.getFitnessLevel());
    }

    @Test
    void testTC004() {
        HealthIndexScore health = new HealthIndexScore(99, 73, 15);
        assertEquals(11, health.getTotalScore(), "TC004: Expected 11");
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, health.getFitnessLevel());
    }

    @Test
    void testTC005() {
        HealthIndexScore health = new HealthIndexScore(100, 73, 15);
        assertEquals(11, health.getTotalScore(), "TC005: Expected  11");
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, health.getFitnessLevel());
    }

    @Test
    void testTC006() {
        HealthIndexScore health = new HealthIndexScore(35, 40, 15);
        assertEquals(10, health.getTotalScore(), "TC006: Expected  10");
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, health.getFitnessLevel());
    }

    @Test
    void testTC007() {
        HealthIndexScore health = new HealthIndexScore(35, 41, 15);
        assertEquals(10, health.getTotalScore(), "TC007: Expected  10");
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, health.getFitnessLevel());
    }

    @Test
    void testTC008() {
        HealthIndexScore health = new HealthIndexScore(35, 219, 15);
        assertEquals(6, health.getTotalScore(), "TC008: Expected  6");
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, health.getFitnessLevel());
    }

    @Test
    void testTC009() {
        HealthIndexScore health = new HealthIndexScore(35, 220, 15);
        assertEquals(6, health.getTotalScore(), "TC009: Expected  6");
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, health.getFitnessLevel());
    }

    @Test
    void testTC010() {
        HealthIndexScore health = new HealthIndexScore(35, 73, 0);
        assertEquals(6, health.getTotalScore(), "TC010: Expected  6");
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, health.getFitnessLevel());
    }

    @Test
    void testTC011() {
        HealthIndexScore health = new HealthIndexScore(35, 73, 1);
        assertEquals(6, health.getTotalScore(), "TC011: Expected  6");
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, health.getFitnessLevel());
    }

    @Test
    void testTC012() {
        HealthIndexScore health = new HealthIndexScore(35, 73, 29);
        assertEquals(10, health.getTotalScore(), "TC012: Expected  10");
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, health.getFitnessLevel());
    }

    @Test
    void testTC013() {
        HealthIndexScore health = new HealthIndexScore(35, 73, 30);
        assertEquals(10, health.getTotalScore(), "TC013: Expected 10");
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, health.getFitnessLevel());
    }

}
