package observer;

/**
 * A book that has the possibility of being added to the bestsellers list.
 * @author Wade Little
 */
public class Book {
    private String title;
    private Genre genre;
    private String authorFirstName;
    private String authorLastName;
    private String description;

    /**
     * Initializes/creates an instance of a book
     * 
     * @param title           The title of the book
     * @param genre           The genre of the book. Uses an ENUM Genre
     * @param authorFirstName The Author of the books first name
     * @param authorLastName  The author of the books last name
     * @param description     A description of the book
     */
    public Book(String title, Genre genre, String authorFirstName, String authorLastName, String description) {
        this.title = title;
        this.genre = genre;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.description = description;
    }

    /**
     * Gets the title of the book
     * 
     * @return A string of the title of the book
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the genre of the book
     * 
     * @return A genre of the genre of the book
     */
    public Genre getGenre() {
        return genre;
    }

    /**
     * Gets the authors first name
     * 
     * @return A string of the authors first name
     */
    public String getAuthorFirstName() {
        return authorFirstName;
    }

    /**
     * Gets the authors last name
     * 
     * @return A string of the authors last name
     */
    public String getAuthorLastName() {
        return authorLastName;
    }

    /**
     * Gets a description of the book
     * 
     * @return A string of the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Outputs all of the books information
     * 
     * @return A string value with all of the book data concatenated together
     */
    public String toString() {
        return "----- " + this.title + "----- \n" + this.genre + " by: " + this.authorFirstName + " "
                + this.authorLastName + "\n" + this.description + "\n";
    }
}
