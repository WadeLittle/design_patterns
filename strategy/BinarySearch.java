package strategy;

import java.util.Collections;
import java.util.List;
/**
 * Performs a Binary Search (implements the SearchBehavior interface)
 * @author Wade Little
 */
public class BinarySearch implements SearchBehavior{
    /**
     * Uses the binary search algorithim to see if a specified Person is in a list of Persons
     * @param people A list of Persons
     * @param person The person you are searching/checking for
     * @return A boolean value (True if the person is in the list, False if the person isn't found in the list)
     */
 public boolean contains(List<Person> people, Person person) {
        Collections.sort(people);

        int left = 0;
        int right = people.size() - 1;

        while(left <= right) {
            int mid = left + (right - left) / 2;
            Person middlePerson = people.get(mid);
            int comparisonValue = middlePerson.compareTo(person);
            if(comparisonValue == 0) {
            return true;
            } else if (comparisonValue > 0) {
                right = mid -1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}
