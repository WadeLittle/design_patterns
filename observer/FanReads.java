package observer;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class FanReads implements Observer {
    private Subject subject;
    private HashMap<Genre, ArrayList<Book>> recommendations;

    public FanReads(Subject subject, String firstName, String lastName) {
        this.recommendations = new HashMap<Genre, ArrayList<Book>>();
        this.subject=subject;
        subject.registerObserver(this);
    }
    public void update(Book book) {
            
        ArrayList<Book> genreBooks = recommendations.get(book.getGenre());

        if(genreBooks == null) {
            genreBooks = new ArrayList<Book>();
            recommendations.put(book.getGenre(),genreBooks);
        }
        genreBooks.add(book);
    }
    public ArrayList<Book> getRecommendations(Genre genre) {
        return recommendations.get(genre);

    }
}
