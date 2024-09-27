import java.util.ArrayList;

/**
 * This keeps tracks of all of the flights for a certain airline
 * 
 * @author Wade Little
 */
public class Airline {
    private String title;
    private ArrayList<Flight> flights;

    /**
     * Constructor for an airline that sets the title of the airline and reads the
     * flights from the flight file.
     * 
     * @param title The title of the airline
     */
    public Airline(String title) {
        this.title = title;
        this.flights = FlightLoader.getFlights();
    }

    /**
     * Gets the Airlines Title
     * 
     * @return the airlines title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Creates an iterator that searches the flight list based off of the user
     * inputed fromCode and toCode
     * 
     * @param fromCode The airport code the user is coming from
     * @param toCode   The airport code the user is going to
     * @return A new flightIterator that goes through the list of flights searching
     *         for the users from and to code
     */
    public FlightIterator createIterator(String fromCode, String toCode) {
        try {
            Airport from = Airport.valueOf(fromCode.toUpperCase());
            Airport to = Airport.valueOf(toCode.toUpperCase());
            return new FlightIterator(flights, from, to);

        } catch (IllegalArgumentException e) {
            System.err.println("Invalid airport code: " + e.getMessage());
            return null;
        }
    }
}
