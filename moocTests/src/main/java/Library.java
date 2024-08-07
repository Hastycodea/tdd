import java.util.ArrayList;
import java.util.Collection;

public class Library {

    private Collection<Movie> catalogue = new ArrayList<>();

    
    public void donate(Movie movie) {
        catalogue.add(movie);
        movie.addCopies();
    }

    public boolean contains(Movie movie) {
        return catalogue.contains(movie);
    }

}
