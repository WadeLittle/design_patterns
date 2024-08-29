package strategy;

import java.util.List;
/**
 * Performs a LinearSearch (implements the SearchBehavior interface)
 * @author Wade Little
 */
public class LinearSearch implements SearchBehavior {
    
    /**
     * Uses a linear search algorithim to check for a Person in a list of Persons
     * @param people A list of persons you want to search through
     * @param person A person you are trying to find in the list
     * @return Returns true if the person is found. Returns false if the person isn't found
     */
    public boolean contains(List<Person> people, Person person) {
        for(Person p: people) {
            if(p.equals(person))
                return true;   
        }
        return false;
    }

}
