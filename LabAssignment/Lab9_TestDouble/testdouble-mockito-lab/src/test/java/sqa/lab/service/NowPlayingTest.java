package sqa.lab.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sqa.lab.stub.MovieServiceStub;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * กิจกรรมที่ 9.1: การสร้าง Stub เพื่อใช้ในการทดสอบระดับ Integration Testing
 */
public class NowPlayingTest {

    private NowPlaying nowPlaying;

    @BeforeEach
    void setUp() {
        // ส่ง Stub เข้าไปใน NowPlaying
        MovieServiceStub stubService = new MovieServiceStub();
        nowPlaying = new NowPlaying(stubService);
    }

    @Test
    @DisplayName("ทดสอบการคัดกรองรายการภาพยนตร์ให้แสดงผลเฉพาะ VIP cinema เท่านั้น")
    void testFilterVIPCinema() {
        // Act: เรียกคัดกรองเฉพาะ VIP cinema
        List<String> vipMovies = nowPlaying.getMoviesByCinemaType("VIP cinema", "KKU Cinema", "2026-08-23");

        // Assert: ตรวจสอบผลลัพธ์
        assertNotNull(vipMovies, "ผลลัพธ์ต้องไม่เป็น null");
        assertEquals(2, vipMovies.size(), "ต้องมีภาพยนตร์ใน VIP cinema ทั้งหมด 2 เรื่อง");
        assertTrue(vipMovies.contains("The Odyssey"), "ต้องมีภาพยนตร์เรื่อง The Odyssey");
        assertTrue(vipMovies.contains("The End of Oak Street"), "ต้องมีภาพยนตร์เรื่อง The End of Oak Street");
        assertFalse(vipMovies.contains("Spider-Man: Brand New Day"), "ต้องไม่มีภาพยนตร์ของโรงประเภทอื่น เช่น IMAX");
    }
}
