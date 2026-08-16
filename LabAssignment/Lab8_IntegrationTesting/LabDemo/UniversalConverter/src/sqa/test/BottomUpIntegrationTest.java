package sqa.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sqa.main.DistanceConverter;
import sqa.main.WeightConverter;
import sqa.main.TemperatureConverter;
import sqa.main.UniversalConverter;

class BottomUpIntegrationTest {

    // Level 1: ทดสอบโมดูลระดับล่างสุด (Sub-modules)

    @Test
    void testLevel1_DistanceConverter_km_to_mile() {
        DistanceConverter dc = new DistanceConverter();
        double expected = 3.105; // 5 * 0.621
        assertEquals(expected, dc.convert(5.0, "kilometer", "mile"), 0.001);
    }

    @Test
    void testLevel1_WeightConverter_kg_to_g() {
        WeightConverter wc = new WeightConverter();
        double expected = 5000.0; // 5 * 1000
        // เคสนี้จะ Fail เพราะใน WeightConverter เขียน 1.0/1000 ได้ 0.005
        assertEquals(expected, wc.convert(5.0, "kilogram", "gram"), 0.001);
    }

    @Test
    void testLevel1_TemperatureConverter_C_to_F() {
        TemperatureConverter tc = new TemperatureConverter();
        double expected = 212.0; // (100 * 9/5) + 32
        // เคสนี้จะ Fail เพราะ 9/5 ในภาษา Java ได้ 1 ทำให้คำนวณได้ 132.0
        assertEquals(expected, tc.convert(100.0, "C", "F"), 0.001);
    }

    // Level 2: นำมา Integrate กับโมดูลบนสุด (UniversalConverter)

    @Test
    void testLevel2_UniversalConverter_Distance() {
        UniversalConverter uc = new UniversalConverter();
        double expected = 3.105;
        assertEquals(expected, uc.convert(5.0, "Distance", "kilometer", "mile"), 0.001);
    }

    @Test
    void testLevel2_UniversalConverter_Weight() {
        UniversalConverter uc = new UniversalConverter();
        double expected = 5000.0;
        // เคสนี้จะ Fail ตามโมดูล WeightConverter
        assertEquals(expected, uc.convert(5.0, "Weight", "kilogram", "gram"), 0.001);
    }

    @Test
    void testLevel2_UniversalConverter_Temperature() {
        UniversalConverter uc = new UniversalConverter();
        double expected = 212.0;
        // เคสนี้จะ Fail ตามโมดูล TemperatureConverter
        assertEquals(expected, uc.convert(100.0, "Temperature", "C", "F"), 0.001);
    }
}
