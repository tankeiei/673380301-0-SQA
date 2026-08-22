package sqa.lab.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * กิจกรรมที่ 9.2: การสร้าง Mock ด้วย Mockito Framework (ข้อ b: จำนวนผู้เข้าชมที่ผ่านการตรวจตั๋วแล้ว)
 */
@ExtendWith(MockitoExtension.class)
public class GateCheckinTest {

    @Mock
    private TicketCounter mockTicketCounter; // Mock TicketCounter สำหรับตรวจสอบการนับตั๋ว

    private GateCheckin gateCheckin;

    @BeforeEach
    void setUp() {
        // Inject Mock TicketCounter เข้า GateCheckin
        gateCheckin = new GateCheckin(mockTicketCounter);
    }

    @Test
    @DisplayName("กรณีที่ 1: ลูกค้าเข้าตรวจตั๋วครั้งแรก -> ต้องบันทึกตั๋วและเรียก changeTicketStatus(true) 1 ครั้ง")
    void testCustomerEntry_FirstTime_ShouldRecordAndChangeTicketStatus() {
        int ticketId = 101;

        // Act: สแกนตั๋ว
        gateCheckin.customerEntry(ticketId);

        // Assert: ตรวจสอบว่าใน Set มีตั๋วนี้อยู่
        assertTrue(gateCheckin.getPassengersOnBoard().contains(ticketId));
        
        // Behavior Verification: ตรวจสอบว่า changeTicketStatus(true) ถูกเรียก 1 ครั้ง
        verify(mockTicketCounter, times(1)).changeTicketStatus(true);
    }

    @Test
    @DisplayName("กรณีที่ 2: สแกนตั๋วซ้ำ (คนเดิม) -> ต้องไม่เรียก changeTicketStatus เพิ่ม")
    void testCustomerEntry_DuplicateTicket_ShouldNotCallChangeTicketStatusAgain() {
        int ticketId = 101;

        // สแกนครั้งที่ 1
        gateCheckin.customerEntry(ticketId);
        // สแกนครั้งที่ 2 ด้วยรหัสตั๋วเดิม
        gateCheckin.customerEntry(ticketId);

        // Assert: ยังคงมีผู้โดยสารรหัส 101 แค่ 1 คน
        assertEquals(1, gateCheckin.getPassengersOnBoard().size());

        // Behavior Verification: changeTicketStatus(true) ต้องถูกเรียกแค่ 1 ครั้งเท่านั้น (รอบสองไม่ถูกเรียก)
        verify(mockTicketCounter, times(1)).changeTicketStatus(true);
    }

    @Test
    @DisplayName("กรณีที่ 3: สแกนตั๋ว 2 ใบต่างกัน -> ต้องเรียก changeTicketStatus รวม 2 ครั้ง")
    void testCustomerEntry_MultipleCustomers_ShouldCallChangeTicketStatusTwice() {
        gateCheckin.customerEntry(101);
        gateCheckin.customerEntry(102);

        // Assert: มีผู้โดยสาร 2 คน
        assertEquals(2, gateCheckin.getPassengersOnBoard().size());

        // Behavior Verification: changeTicketStatus(true) ต้องถูกเรียก 2 ครั้ง
        verify(mockTicketCounter, times(2)).changeTicketStatus(true);
    }
}
