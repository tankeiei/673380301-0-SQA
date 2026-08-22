package sqa.lab.service;

import sqa.lab.model.Movie;
import java.util.ArrayList;
import java.util.List;

/**
 * CP353201 Software Quality Assurance (1/2569)
 * Lab#9 – Test Double
 * 
 * Class NowPlaying ทำหน้าที่คัดกรองการแสดงผลรายการภาพยนตร์เฉพาะประเภทโรงที่ต้องการ
 */
public class NowPlaying {

    private MovieService movieService;

    // Constructor Injection
    public NowPlaying(MovieService movieService) {
        this.movieService = movieService;
    }

    /**
     * คัดกรองและส่งคืนรายชื่อภาพยนตร์ที่ฉายในโรงประเภทที่ระบุ
     * @param cinemaType ประเภทโรง เช่น "VIP cinema", "IMAX with Laser"
     * @param location โรงภาพยนตร์
     * @param date วันที่
     * @return List ของชื่อภาพยนตร์ที่ตรงกับประเภทโรง
     */
    public List<String> getMoviesByCinemaType(String cinemaType, String location, String date) {
        List<Movie> allMovies = movieService.fetchMovies(location, date);
        List<String> filteredMovies = new ArrayList<>();

        if (allMovies != null) {
            for (Movie movie : allMovies) {
                if (movie.getCinemaType() != null && movie.getCinemaType().equalsIgnoreCase(cinemaType)) {
                    filteredMovies.add(movie.getName());
                }
            }
        }
        return filteredMovies;
    }
}
