package sqa.lab.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

/**
 * กิจกรรมที่ 9.2: การสร้าง Mock ด้วย Mockito Framework (ข้อ a: หมายเลขที่นั่งว่าง)
 */
@ExtendWith(MockitoExtension.class)
public class SeatReservationTest {

    @Mock
    private SeatDAO mockSeatDAO; // Mock SeatDAO เพื่อไม่ต้องเชื่อมต่อกับ Database จริง

    private SeatReservation seatReservation;

    @BeforeEach
    void setUp() throws SQLException {
        // กำหนดพฤติกรรมจำลอง (Stubbing) เมื่อเรียก fetchAvailableSeats()
        List<String> mockAvailableSeats = Arrays.asList("A1", "A2", "B1", "B2");
        when(mockSeatDAO.fetchAvailableSeats()).thenReturn(mockAvailableSeats);

        // Inject Mock DAO เข้า SeatReservation
        seatReservation = new SeatReservation(mockSeatDAO);
    }

    @Test
    @DisplayName("ทดสอบกรณีที่นั่งว่าง (มีอยู่ในรายการที่ดึงมา) -> ต้องคืนค่า true")
    void testCheckSeatAvailability_WhenSeatIsAvailable_ShouldReturnTrue() throws SQLException {
        boolean isAvailable = seatReservation.checkSeatAvailability("A1");
        assertTrue(isAvailable, "ที่นั่ง A1 ว่างอยู่ ต้องคืนค่าเป็น true");
    }

    @Test
    @DisplayName("ทดสอบกรณีที่นั่งไม่ว่าง / ไม่มีอยู่ในระบบ -> ต้องคืนค่า false")
    void testCheckSeatAvailability_WhenSeatIsNotAvailable_ShouldReturnFalse() throws SQLException {
        boolean isAvailable = seatReservation.checkSeatAvailability("C1");
        assertFalse(isAvailable, "ที่นั่ง C1 ไม่มีในรายการว่าง ต้องคืนค่าเป็น false");
    }
}
