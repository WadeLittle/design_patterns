package strategy;

import java.util.List;

public class LinearSearch implements SearchBehavior {
    public boolean contains(List<Person> people, Person person) {
        //TODO search using linear search algorithim and return a boolean value of whether or not the Person is in attendees
        for(Person p: people) {
            if(p.equals(person))
                return true;
            
        }
        return false;
    }

}
