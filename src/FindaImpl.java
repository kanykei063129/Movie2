import java.util.Scanner;

public class FindaImpl implements Findable {
    @Override
    public void getAllMovies(Movie[] movies) {
        for (Movie m : movies) {
            System.out.println(m);
        }
    }

    @Override
    public void findMovieByName(Movie[] movies) {
        String movieName = new Scanner(System.in).nextLine();
        for (Movie m : movies) {
            if (movieName.equals(m.getName())) {
                System.out.println(m);
            }
        }
    }

    @Override
    public void findMovieByActorName(Movie[] movies) {

        String actorName = new Scanner(System.in).nextLine();
        for (Movie m : movies) {
            for (Cast cast : m.getCasts()) {
                if (cast.getActorFullName().toUpperCase().contains(actorName.toUpperCase())) {
                    System.out.println(m);
                }
            }
        }
    }

    @Override
    public void findMovieByYear(Movie[] movies) {
        int year = new Scanner(System.in).nextInt();
        for (Movie m : movies) {
            if (m.getYear() == year) {
                System.out.println(m);
            }
        }
    }

    @Override
    public void findMovieByDirector(Movie[] movies) {
        String director = new Scanner(System.in).nextLine();
        for (Movie m : movies) {
            if (director.equals(m.getDirector().getName())) {
                System.out.println(m);
            }
        }
    }


    @Override
    public void findMovieByDescription(Movie[] movies) {
        String description = new Scanner(System.in).nextLine();
        for (Movie m : movies) {
            if (description.equals(m.getDescription())) {
                System.out.println(m);
            }
        }
    }

    @Override
    public void findMovieByRole(Movie[] movies) {
        String roly = new Scanner(System.in).nextLine();
        for (Movie me : movies) {
            for (Cast cast : me.getCasts()) {
                if (cast.getRole().toUpperCase().contains(roly.toUpperCase())) {
                    System.out.println(me);
                }
            }
        }
    }
}