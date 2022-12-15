import movie.Cast;
import movie.Director;
import movie.Movie;
import movie.MovieImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Director director1 = new Director("Djeims", "Kemeron");
        Director director2 = new Director("Roman", "Polanskyi");
        Director director3 = new Director("Andreia", "Ekkerbum");
        Director director4 = new Director("Mark", "Mailod");
        Director director5 = new Director("Ioakim", "Renning");
        ArrayList<Director> directors = new ArrayList<>(Arrays.asList(director1, director2, director3, director4, director5));

        Movie movie1 = new Movie("Avator", 2022, director1, new ArrayList<>(List.of(new Cast("Zoi Saldana", "Neitiri"))));
        Movie movie2 = new Movie("Pianist", 2002, director2, new ArrayList<>(List.of(new Cast("Edrian Broudi", "Vladeka Shpilmana"))));
        Movie movie3 = new Movie("Prikuchenie Teddi", 2022, director3, new ArrayList<>(List.of(new Cast("Mariann Hole", "Marianna"))));
        Movie movie4 = new Movie("Menu", 2022, director4, new ArrayList<>(List.of(new Cast("Nikolas Holt", "Teilor"))));
        Movie movie5 = new Movie("Malefisenta", 2019, director5, new ArrayList<>(List.of(new Cast("Anjelina Djoli", "Lesli Menvill"))));
        List<Movie> movies = new ArrayList<>(Arrays.asList(movie1, movie2, movie3, movie4, movie5));
        MovieImpl movie = new MovieImpl();


        System.out.println("""
                1.SortByNameDirector!
                2.SortByLastNameDictor!
                3.Movienin atin jaz!
                4.Movienin jilin jaz == jil bolso chiksyn!
                5.Movienin ati chiksyn!
                6.Casts ati chiksyn!
                7.Movienin birinchi aty chiksyn!
                8.Kancha movie bolso chyksin!
                """);
        Scanner scanner = new Scanner(System.in);
        while (true) {
        int number = scanner.nextInt();
            switch (number) {
                case 1 -> {
                    movie.findMovieByName(movies, scanner.next());
                  //  movies.stream().filter(s -> s.getName().equals(name)).forEach(System.out::println);
                    List<Director> directors1 = directors.stream().filter(director -> director.getName().contains("Andreia")).toList();
                    System.out.println(directors1);
                }
                case 2 -> {
                    List<Director> directors2 = directors.stream().filter(director -> director.getLastName().contains("Mailod")).toList();
                    System.out.println(directors2);
                }
                case 3 -> {
                    List<Movie> movies1 = movies.stream().filter(movie6 -> movie6.getName().contains("Avator")).toList();
                    System.out.println(movies1);
                }
                case 4 -> {List<Movie> movies2 = movies.stream().filter(movie6 -> movie6.getYear() == 2019).toList();
                System.out.println(movies2);
            }
                 case 5-> movies.stream().map(Movie::getName).forEach(System.out::println);
                 case 6-> movies.stream().map(Movie::getCasts).forEach(System.out::println);
              case 7->  System.out.println(movies.stream().findFirst().map(Movie::getName).orElseThrow());
               case 8 -> System.out.println(movies.stream().map(Movie::getName).count());

            }
        }
    }
}

