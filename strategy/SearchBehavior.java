package strategy;

import java.util.List;
/**
 * Sets the structure for search behavior 
 * @author Wade Little
 */
public interface SearchBehavior {
    
    /**
     * A method that will check if a Person is in a list of Persons
     * @param people A list of Persons you want to search through 
     * @param person A Person you are trying to see if the list contains
     * @return A boolean value that returns true if the person is found in the list and false if the person isn't found in the list
     */
    public boolean contains(List<Person> people, Person person);
}
