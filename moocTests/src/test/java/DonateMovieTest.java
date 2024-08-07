import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class DonateMovieTest {
    
    private Library library;
    private Movie movie;

    public DonateMovieTest() {
        library = new Library();
        movie = new Movie();
    }

    @Test
    public void moviesAddedToCatalogue() {
        library.donate(movie);
        assertTrue(library.contains(movie)); 
    }

    @Test
    public void rentalCopyAdded() {
        library.donate(movie);
        assertEquals(1, movie.getCopies());
    }
}
