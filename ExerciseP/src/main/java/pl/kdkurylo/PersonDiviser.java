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
        for (Person person : people) {
            if (person.getAge() < 18) {
                juniors.add(person);
            }
        }
        return juniors;
    }

    public List<Person> getWorkingClass() {
        List<Person> workingClass = new ArrayList<>();
        for (Person person : people) {
            if ((person.getAge() >= 18) && (person.getAge() <= 67)) {
                workingClass.add(person);
            }
        }
        return workingClass;
    }

    public List<Person> getSeniors() {
        List<Person> seniors = new ArrayList<>();
        for (Person person : people) {
            if (person.getAge() > 67) {
                seniors.add(person);
            }
        }
        return seniors;
    }
}