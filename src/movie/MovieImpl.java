package movie;

import java.util.Comparator;
import java.util.List;

public class MovieImpl implements Findable,Sortable {

    @Override
    public void findMovieByName(List<Movie> movies, String name) {
        movies.stream().filter(s -> s.getName().equals(name)).forEach(System.out::println);
    }

    @Override
    public void findByActor(List<Movie> movies, String actor) {
//        int counter = 0;
//        for (Movie movie : movies) {
//            if (movie.getCasts().get(counter).getActorFullName().contains(actor)) {
//                System.out.println(movie.getName() + movie.getYear());
//            }
//        }

    }

    @Override
    public void findByYear(List<Movie> movies, int year) {
        movies.stream().max(Comparator.comparing(Movie::getYear)).orElseThrow();
//        for (Movie movie : movies) {
//            if (movie.getYear() == year) {
//                System.out.println(movie.getYear() + movie.getName());
//            }
//        }

    }

    @Override
    public void findByDirector(List<Movie> movies, String director) {
        for (Movie movie : movies) {
            if (movie.getDirector().getLastName().contains(director)) {
                System.out.println(movie.getName() + movie.getYear());
            }
        }

    }

    @Override
    public void findByDescription(List<Movie> movies, String description) {
        for (Movie movie : movies) {
            if (movie.getDirector().equals(description)) {

                System.out.println(movie.getName() + movie.getYear());
            }
        }

    }

    @Override
    public void findByRole(List<Movie> movies, String role) {
        int counter = 0;
        for (Movie movie : movies) {
            if (movie.getCasts().get(counter).getRole().contains(role)) {
                System.out.println(movie);
            }
        }

    }

    @Override
    public void sortByMovieName(List<Movie> movies) {

    }

    public static Comparator<Movie> sortByMovieNameAZ = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
    public static Comparator<Movie> sortByYear = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getYear() - o2.getYear();
        }
    };





    @Override
    public void sortByYear(List<Movie> movies) {

    }
    public static Comparator<Movie> sortByDirector=new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return  o1.getDirector().getLastName().compareTo(o2.getDirector().getLastName()) ;
        }
    };

    @Override
    public void sortByDirector(List<Movie> movies) {

    }

    @Override
    public void sortByActor(List<Movie> movies) {

    }
//    public static Comparator<Movie> sortByActor=new Comparator<Movie>() {
//        @Override
//        public int compare(Movie o1, Movie o2) {
//
//            return o1.getCasts().get();
//        }
//    };
}




































