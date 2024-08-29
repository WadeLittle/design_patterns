package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * This class maintains a list of observers as well as a list of
 * books(bestsellers)
 * @author Wade Little
 */
public class BestSellers implements Subject {
    private List<Observer> observers;
    private List<Book> bestSellers;

    /**
     * The BestSellers constructor that creates ArrayLists of observers and
     * bestsellers
     */
    public BestSellers() {
        this.observers = new ArrayList<Observer>();
        this.bestSellers = new ArrayList<Book>();
    }

    
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Book book) {
        for (Observer observer : observers) {
            observer.update(book);
        }
    }

    /**
     * Adds a book to the BestSellers list and updates the observers of the new book
     * 
     * @param title           The title of the book
     * @param genre           The genre of the book
     * @param authorFirstName The authors first name
     * @param authorLastName  The Authors last name
     * @param description     A description of the book
     */
    public void addBook(String title, Genre genre, String authorFirstName, String authorLastName, String description) {
        Book book = new Book(title, genre, authorFirstName, authorLastName, description);
        bestSellers.add(book);
        notifyObservers(book);
    }

}
