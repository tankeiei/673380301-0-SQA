package sqa.lab.service;

import sqa.lab.model.Movie;
import java.util.List;

/**
 * CP353201 Software Quality Assurance (1/2569)
 * Lab#9 – Test Double
 * 
 * Interface MovieService ทำหน้าที่ส่ง Request รายการภาพยนตร์
 * เมื่อมีการระบุโรงภาพยนตร์ (location) และวันที่ (date) ไปยัง MoviePortal
 */
public interface MovieService {
    List<Movie> fetchMovies(String location, String date);
}
