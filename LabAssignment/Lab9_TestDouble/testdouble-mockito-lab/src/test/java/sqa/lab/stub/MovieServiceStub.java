package sqa.lab.stub;

import sqa.lab.model.Movie;
import sqa.lab.service.MovieService;

import java.util.ArrayList;
import java.util.List;

/**
 * CP353201 Software Quality Assurance (1/2569)
 * Lab#9 – Test Double
 * 
 * Stub Class สำหรับจำลอง Response ของ MovieService
 * เพื่อใช้ทดสอบการคัดกรองเฉพาะ VIP cinema
 */
public class MovieServiceStub implements MovieService {

    @Override
    public List<Movie> fetchMovies(String location, String date) {
        List<Movie> dummyMovies = new ArrayList<>();

        // รายการหนังในโรง VIP cinema
        dummyMovies.add(new Movie("The Odyssey", "VIP cinema"));
        dummyMovies.add(new Movie("The End of Oak Street", "VIP cinema"));

        // รายการหนังในโรงประเภทอื่นๆ
        dummyMovies.add(new Movie("Spider-Man: Brand New Day", "IMAX with Laser"));
        dummyMovies.add(new Movie("Avatar 3", "Standard"));

        return dummyMovies;
    }
}
