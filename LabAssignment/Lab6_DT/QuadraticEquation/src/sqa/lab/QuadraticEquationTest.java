package sqa.lab;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuadraticEquationTest {

    private QuadraticEquation quadraticEquation;

    @BeforeEach
    void setUp() {
        quadraticEquation = new QuadraticEquation();
    }

    @ParameterizedTest(name = "{0}: a={1}, b={2}, c={3} -> Expected: {4}")
    @CsvSource({
        "TC001 (Rule#1), 0, 4, 1, NOT_QUADRATIC",
        "TC002 (Rule#2), 0, 0, 5, NOT_QUADRATIC",
        "TC004 (Rule#4), 1, 5, 2, REAL_ROOTS",
        "TC005 (Rule#5), 1, 4, 4, EQUAL_ROOTS",
        "TC006 (Rule#6), 2, 1, 3, IMAGINARY_ROOTS"
    })
    @DisplayName("Test determineRootNature with Decision Table Test Cases")
    void testDetermineRootNature(String testCaseId, int a, int b, int c, RootNature expectedNature) {
        RootNature actualNature = quadraticEquation.determineRootNature(a, b, c);
        assertEquals(expectedNature, actualNature, "Failed at " + testCaseId);
    }
}