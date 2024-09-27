import java.util.ArrayList;
import java.util.Iterator;

/**
 * The FlightIterator goes through every flight and can help tell you what
 * flights match your desired to and from airport code.
 * 
 * @author Wade Little
 */
public class FlightIterator implements Iterator<Flight> {
    private ArrayList<Flight> flights;
    private int position;
    private Airport from;
    private Airport to;

    /**
     * Initializes the FlightIterator
     * 
     * @param flights The Arraylist of flights you want to iterate through.
     * @param from    The Airport fromCode you are checking for
     * @param to      The Airport toCode you are checking for
     */
    public FlightIterator(ArrayList<Flight> flights, Airport from, Airport to) {
        this.flights = flights;
        this.from = from;
        this.to = to;
        this.position = 0;
    }

    /**
     * Checks if there is another flight in the flight list
     * 
     * @return True if there is a next element in the list. False if there isn't
     *         another element.
     */
    public boolean hasNext() {
        while (position < flights.size()) {
            Flight currentFlight = flights.get(position);
            if (currentFlight.sameLoc(from, to)) {
                return true;
            }
            position++;
        }
        return false;
    }

    /**
     * Returns the next Flight and moves the position forward
     * 
     * @return the next flight in the list
     */
    public Flight next() {
        Flight flight = flights.get(position);
        position++;
        return flight;
    }
}
