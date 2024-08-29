package observer;
import java.util.ArrayList;
import java.util.List;



public class BestSellers implements Subject {
    private List<Observer> observers;
    private List<Book> bestSellers;

    public BestSellers() {
        this.observers = new ArrayList<Observer>();
        this.bestSellers = new ArrayList<Book>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Book book) {
        for (Observer observer : observers) {
            observer.update(book);
        }
    }
    public void addBook(String title, Genre genre, String authorFirstName, String authorLastName, String description) {
        Book book = new Book(title, genre, authorFirstName, authorLastName, description);
        bestSellers.add(book);
        notifyObservers(book);
    }

}
