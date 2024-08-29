package observer;

import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
/**
 * An observer that holds the top 5 bestsellers in a queue
 * @author Wade Little
 */
public class Store implements Observer {
    private Subject subject;
    private String title;
    private Queue<Book> bestSellers;

    /**
     * Initializes the Store and registers the store as an observer
     * 
     * @param subject The subject the store wants to observe
     */
    public Store(Subject subject) {
        this.subject = subject;
        this.bestSellers = new LinkedList<Book>();
        subject.registerObserver(this);
    }

    public void update(Book book) {
        if (bestSellers.size() >= 5) {
            bestSellers.poll();
        }
        bestSellers.add(book);
    }

    /**
     * Gets the top 5 best sellers
     * 
     * @return a List of the 5 most recent books on the bestsellers list
     */
    public List<Book> getBestSellers() {
        List<Book> top5List = new LinkedList<Book>();
        int limit = Math.min(5, bestSellers.size());
        for (int i = 0; i < limit; i++) {
            top5List.add(bestSellers.remove());
        }

        return top5List;
    }

}
