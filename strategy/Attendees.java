package strategy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Attendees {
    private String title;
    private List<Person> people;
    private SearchBehavior searchBehavior;

    public  Attendees(String title) {
        this.title = title;
        this.people = new ArrayList();
        this.searchBehavior = null;
    }
    public Person add(String firstName, String lastName, String phoneNumber, String reminder) {
        Person personToAdd = new Person(firstName, lastName, phoneNumber, reminder);
        if(searchBehavior != null && searchBehavior.contains(people, personToAdd)) {
            return null;
        }else {
        this.people.add(personToAdd);
        return personToAdd;
        }
    }
    public String getTitle() {
        return title;
    }
    public void setSearchBehavior(SearchBehavior searchBehavior) {
        this.searchBehavior = searchBehavior;
    }
    public List<Person> getList() {
        return people;
    }
   
    



}
