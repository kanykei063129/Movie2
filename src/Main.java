import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FindaImpl finda = new FindaImpl();
        Scanner input = new Scanner(System.in);
        Director director1 = new Director("Douglas", "Mackinnon");
        Director director2 = new Director("Some", "Director");
        Director director3 = new Director("Happy", "Guy");
        Director director4 = new Director("Joe", "Ranft");
        Director director5 = new Director("Paul", "McGuigan");

        Cast cast1 = new Cast("David Tennant", "Crowley");
        Cast[] casts1 = {cast1};

        Cast cast2 = new Cast("Some Girl", "Andry Fae");
        Cast[] casts2 = {cast2};

        Cast cast3 = new Cast("Daniel Radcliffe", "Harry Potter");
        Cast[] casts3 = {cast3};

        Cast cast4 = new Cast("Owen Wilson", "Mc.Queen");
        Cast[] casts4 = {cast4};

        Cast cast5 = new Cast("Una Stubbs", "Mrs. Hudson");
        Cast[]casts5 = {cast5};
        Cast[]casts = {cast1,cast2,cast3,cast4,cast5};

        Movie movie1 = new Movie("Good omens", 2019, "TV Series", director1, casts1);
        Movie movie2 = new Movie("Carnivai Row", 2019, "TV Series", director2, casts2);
        Movie movie3 = new Movie("Harry Potter", 2005, "Movie", director3, casts3);
        Movie movie4 = new Movie("Cars", 2006, "cartoon", director4, casts4);
        Movie movie5 = new Movie("Season 1", 2010, "crime", director5, casts5);
        Movie[] movies = {movie1, movie2, movie3, movie4, movie5};
        while (true) {
            System.out.println("""
                    1 -> all movies
                    2 -> find movie by name
                    3 -> find movie by actors name
                    4 -> find movie by year
                    5 -> find movie by director name
                    6 -> find movie by description
                    7 -> find movie by role
                     """);

            switch (input.nextInt()) {
                case 1 -> {
                    for (Movie m: movies) {
                        System.out.println(m);
                    }
                }
                case 2 -> finda.findMovieByName(movies);
                case 3 -> finda.findMovieByActorName(movies);
                case 4 -> finda.findMovieByYear(movies);
                case 5 -> finda.findMovieByDirector(movies);
                case 6 -> finda.findMovieByDescription(movies);
                case 7 -> finda.findMovieByRole(movies);
            }
        }
    }
    }
