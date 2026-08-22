package sqa.lab.model;

/**
 * CP353201 Software Quality Assurance (1/2569)
 * Lab#9 – Test Double
 * Model class สำหรับเก็บข้อมูลภาพยนตร์และประเภทโรงฉาย
 */
public class Movie {
    private String name;
    private String cinemaType; // เช่น "VIP cinema", "IMAX with Laser", "Standard"

    public Movie(String name, String cinemaType) {
        this.name = name;
        this.cinemaType = cinemaType;
    }

    public String getName() {
        return name;
    }

    public String getCinemaType() {
        return cinemaType;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", cinemaType='" + cinemaType + '\'' +
                '}';
    }
}
