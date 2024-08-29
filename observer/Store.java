package observer;

import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class Store implements Observer{
    private Subject subject;
    private String title;
    private Queue<Book> bestSellers;

    public Store(Subject subject) {
        this.subject = subject;
        this.bestSellers = new LinkedList<Book>();
        subject.registerObserver(this);
    }
    public void update(Book book) {
        if(bestSellers.size() >= 5) {
            bestSellers.poll();
        }
        bestSellers.add(book);
    }
    public List<Book> getBestSellers() {
       List<Book> top5List = new LinkedList<Book>();
       int limit = Math.min(5, bestSellers.size());
       for (int i = 0;i <limit; i++) {
        top5List.add(bestSellers.remove());
       }
    
       return top5List;
    }

}
