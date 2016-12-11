package pl.kdkurylo;

import java.util.ArrayList;
import java.util.List;

public class PersonDiviser implements PersonDiviserInterface {

    private List<Person> people;

    public PersonDiviser(List<Person> people) {
        this.people = people;
    }

    public List<Person> getJuniors() {
        List<Person> juniors = new ArrayList<>();
        for (int i = 0; i < (people.size()); i++) {
            if ((people.get(i)).getAge() < 18) ;
            juniors.add(people.get(i));
        }
        return juniors;
    }

    public List<Person> getWorkingClass() {
        List<Person> workingClass = new ArrayList<>();
        for (int i = 0; i < (people.size()); i++) {
            if (((people.get(i)).getAge() >= 18) && ((people.get(i)).getAge() <= 67)) {
                workingClass.add(people.get(i));
            }
        }
        return workingClass;
    }

    public List<Person> getSeniors() {
        List<Person> seniors = new ArrayList<>();
        for (int i = 0; i < people.size(); i++) {
            if ((people.get(i)).getAge() > 67) {
                seniors.add(people.get(i));
            }
        }
        return seniors;
    }
}