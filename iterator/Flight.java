import java.time.Duration;
import java.time.LocalTime;

/**
 * A flight that keeps tracks of details including flightNum, airport its going
 * from and to, start and endtime, and the number of transfers
 * 
 * @author Wade Little
 */
public class Flight {
    private String flightNum;
    private Airport from;
    private Airport to;
    private LocalTime startTime;
    private LocalTime endTime;
    private int numTransfers;

    /**
     * Creates a Flight
     * 
     * @param flightNum    The flights flight number
     * @param from         The flights Airport from Code
     * @param to           The flights Airport to Code
     * @param startTime    The flights start time
     * @param endTime      The flights end time
     * @param numTransfers The flights number of transfers
     */
    public Flight(String flightNum, Airport from, Airport to, LocalTime startTime, LocalTime endTime,
            int numTransfers) {
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.startTime = startTime;
        this.endTime = endTime;
        this.numTransfers = numTransfers;
    }

    /**
     * Gets the airport the flight is coming from
     * 
     * @return THe airport the flight is coming from
     */
    public Airport getFrom() {
        return from;
    }

    /**
     * Gets the Airport the flight is going to
     * 
     * @return The airport the flight is going to
     */
    public Airport getTo() {
        return to;
    }

    /**
     * Checks whether the inputted from and to airport codes match the flights from
     * and to code.
     * 
     * @param from Where you are checking if the flight is coming from
     * @param to   Where you are checking if the flight is going to
     * @return Whether or not the flight matches the paramaters to and from airports
     */
    public boolean sameLoc(Airport from, Airport to) {
        return this.from.equals(from) && this.to.equals(to);
    }

    /**
     * Puts the flight data in a String format
     * 
     * @return The flights information as a string
     */
    public String toString() {
        Duration duration = Duration.between(startTime, endTime);
        double hours = duration.toHours();
        double minutes = duration.toMinutes() % 60;
        if (numTransfers > 0) {
            return from + " to " + to +
                    " " + startTime + " - " + endTime + " (" + hours + "h " + minutes + "m) " +
                    " " + numTransfers + " Transfers";

        } else {
            return from + " to " + to +
                    " " + startTime + " - " + endTime + " (" + hours + "h " + minutes + "m) " +
                    " Direct Flight";
        }
    }
}
