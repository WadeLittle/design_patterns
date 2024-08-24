package strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * Creates a list of Attendees
 * @author Wade Little
 */
public class Attendees {
    private String title;
    private List<Person> people;
    private SearchBehavior searchBehavior;
    /**
     * Creates a List of Attendees
     * @param title The title of the event the attendees are going to attend
     */
    public Attendees(String title) {
        this.title = title;
        this.people = new ArrayList();
        this.searchBehavior = new LinearSearch();
    }
    /**
     * Adds a Person to the attendees list if they aren't already on the list
     * @param firstName The Persons First Name
     * @param lastName The Persons Last Name
     * @param phoneNumber The Persons phone number
     * @param reminder The note saved about the person
     * @return Null if the search behavior isn't set or the Person is already on the list of attendeees. Returns the Person if they get successfully added to the list
     */
    public Person add(String firstName, String lastName, String phoneNumber, String reminder) {
        Person personToAdd = new Person(firstName, lastName, phoneNumber, reminder);
        if(searchBehavior != null && searchBehavior.contains(people, personToAdd)) {
            return null;
        }else {
        this.people.add(personToAdd);
        return personToAdd;
        }
    }
    /**
     * Gets the title of the Attendees event
     * @return The title of the event
     */
    public String getTitle() {
        return title;
    }
    /**
     * Sets the search behavior you can use to search through the list of attendees
     * @param searchBehavior A type of searching algorithim (currently LinearSearch and BinarySearch have been implemented)
     */
    public void setSearchBehavior(SearchBehavior searchBehavior) {
        this.searchBehavior = searchBehavior;
    }
    /**
     * Gets the full list of attendees
     * @return a sorted list of Persons that are attending the event
     */
    public List<Person> getList() {
        Collections.sort(people);
        return people;
    }
   
    



}
