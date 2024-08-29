package observer;

/**
 * The observers want updates on the subject(BestSellers)
 * @author Wade Little
 */
public interface Observer {
    /**
     * Updates the observers of the new book addition
     * 
     * @param book A book that is being updated to the observers data collection
     */
    public void update(Book book);
}
