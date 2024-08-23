package strategy;

import java.util.Collections;
import java.util.List;

public class BinarySearch implements SearchBehavior{
 public boolean contains(List<Person> people, Person person) {
        //TODO search using Binary search algorithim and return a boolean value of whether or not the Person is in attendees
        
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
