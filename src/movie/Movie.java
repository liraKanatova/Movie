package movie;

import java.util.Collection;
import java.util.List;

public class Movie {
    private String name;
    private int year;
    private Director director;
    private List<Cast>casts;

    public Movie() {
    }

    public Movie(String name, int year, Director director, List<Cast> casts) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.casts = casts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Cast> getCasts() {
        return casts;
    }

    public void setCasts(List<Cast> casts) {
        this.casts = casts;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", director=" + director +
                ", casts=" + casts +
                '}';
    }



}






