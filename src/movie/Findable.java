package movie;

import java.util.List;

public interface Findable {

    void findMovieByName(List<Movie>movies,String name);
    void findByActor(List<Movie>movies,String actor);
    void findByYear(List<Movie>movies,int year);
    void findByDirector(List<Movie>movies,String director);
    void findByDescription(List<Movie>movies,String description);
    void findByRole(List<Movie>movies,String role);

}
