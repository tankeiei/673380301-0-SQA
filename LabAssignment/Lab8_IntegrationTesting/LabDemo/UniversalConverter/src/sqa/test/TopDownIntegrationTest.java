package sqa.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sqa.main.UniversalConverter;

class TopDownIntegrationTest{

    // 1. Top-Down: ทดสอบฟังก์ชัน DistanceConverter โดยใช้ Stub
    @Test
    void testTopDown_DistanceConverter_withStub() {
        Stub stub = new Stub();
        double expectedResult = 5000.0;
        assertEquals(expectedResult, stub.convert(5, "kilometer", "meter"));
    }

    // 2. Top-Down: ทดสอบ UniversalConverter + DistanceConverter
    @Test
    void testTopDown_UniversalConverter_Distance_Real() {
        UniversalConverter uc = new UniversalConverter();
        double expectedResult = 3.105; // 5 * 0.621
        assertEquals(expectedResult, uc.convert(5.0, "Distance", "kilometer", "mile"), 0.001);
    }

    // 3. Top-Down: ทดสอบ UniversalConverter + WeightConverter
    @Test
    void testTopDown_UniversalConverter_Weight_Real() {
        UniversalConverter uc = new UniversalConverter();
        double expectedResult = 5000.0; // 5 * 1000
        assertEquals(expectedResult, uc.convert(5.0, "Weight", "kilogram", "gram"), 0.001);
    }

    // 4. Top-Down: ทดสอบ UniversalConverter + TemperatureConverter
    @Test
    void testTopDown_UniversalConverter_Temperature_Real() {
        UniversalConverter uc = new UniversalConverter();
        double expectedResult = 212.0; // (100 * 9/5) + 32
        assertEquals(expectedResult, uc.convert(100.0, "Temperature", "C", "F"), 0.001);
    }
}

