package observer;

/*
 * The thing that observers are trying to see/get updated about
 * @author Wade Little
 */
public interface Subject {
    /**
     * Adds an Observer to the list of observers 
     * 
     * @param observer An observer who wants to join the observer list
     */
    public void registerObserver(Observer observer);

    /**
     * Removes an observer from the list of  observers
     * 
     * @param observer An observer who wants to get removed from the 
     *                 observer list
     */
    public void removeObserver(Observer observer);

    /**
     * Notifys the observers of a new book
     * @param book A book that is being added to the bestsellers list
     */
    public void notifyObservers(Book book);
}
