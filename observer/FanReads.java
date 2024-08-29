package observer;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

/**
 * An observer that holds data in a Hashmap allowing easy accesss of a list of books from a specified genre
 * @author Wade Little
 */
public class FanReads implements Observer {
    private Subject subject;
    private HashMap<Genre, ArrayList<Book>> recommendations;

    /**
     * Initializes FanReads and adds the FanRead as an observer
     * 
     * @param subject   The subject the observer/Fanreads wants to observe
     * @param firstName The first name of the fan
     * @param lastName  The last name of the fan
     */
    public FanReads(Subject subject, String firstName, String lastName) {
        this.recommendations = new HashMap<Genre, ArrayList<Book>>();
        this.subject = subject;
        subject.registerObserver(this);
    }

    public void update(Book book) {

        ArrayList<Book> genreBooks = recommendations.get(book.getGenre());

        if (genreBooks == null) {
            genreBooks = new ArrayList<Book>();
            recommendations.put(book.getGenre(), genreBooks);
        }
        genreBooks.add(book);
    }

    /**
     * Gets the book recommendations for the specified genre
     * 
     * @param genre The genre of books the fan wants recommendations for
     * @return An ArrayList of books from the specified genre
     */
    public ArrayList<Book> getRecommendations(Genre genre) {
        return recommendations.get(genre);

    }
}
