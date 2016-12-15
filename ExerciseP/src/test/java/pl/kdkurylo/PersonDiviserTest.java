package pl.kdkurylo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonDiviserTest {

    @Test
    public void shouldReturnJuniorsWhenAgeIsBelow18() {
        List<Person> people = new ArrayList<>();
        Person p1 = new Person(0);
        Person p2 = new Person(10);
        Person p3 = new Person(17);
        Person p4 = new Person(20);
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);

        PersonDiviser pd = new PersonDiviser(people);

        List<Person> juniors = new ArrayList<>();
        juniors.add(p1);
        juniors.add(p2);
        juniors.add(p3);

        List<Person> result = pd.getJuniors();

        assertThat(result).isEqualTo(juniors);
    }

    @Test
    public void shouldReturnWorkingClassWhenAgeIsBetween18And67() {
        List<Person> people = new ArrayList<>();
        Person p0 = new Person(15);
        Person p1 = new Person(18);
        Person p2 = new Person(45);
        Person p3 = new Person(66);
        Person p4 = new Person(67);
        Person p5 = new Person(70);
        people.add(p0);
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);

        PersonDiviser pd = new PersonDiviser(people);

        List<Person> workingClass = new ArrayList<>();
        workingClass.add(p1);
        workingClass.add(p2);
        workingClass.add(p3);
        workingClass.add(p4);

        List<Person> result = pd.getWorkingClass();

        assertThat(result).isEqualTo(workingClass);
    }

    @Test
    public void shouldReturnSeniorsWhenAgeIsAbove67() {
        List<Person> people = new ArrayList<>();
        Person p0 = new Person(30);
        Person p1 = new Person(68);
        Person p2 = new Person(120);
        people.add(p0);
        people.add(p1);
        people.add(p2);

        PersonDiviser pd = new PersonDiviser(people);

        List<Person> seniors = new ArrayList<>();
        seniors.add(p1);
        seniors.add(p2);

        List<Person> result = pd.getSeniors();

        assertThat(result).isEqualTo(seniors);
    }

    @Test
    public void getJuniorsShouldReturnEmptyListIfGotEmptyList1() {
        PersonDiviser pd = new PersonDiviser(new ArrayList<>());

        List<Person> result = pd.getJuniors();

        assertThat(result).isEmpty();
    }

    @Test
    public void getWorkingClassShouldReturnEmptyListIfGotEmptyList2() {
        PersonDiviser pd = new PersonDiviser(new ArrayList<>());

        List<Person> result = pd.getWorkingClass();

        assertThat(result).isEmpty();
    }

    @Test
    public void seniorsShouldReturnEmptyListIfGotEmptyList3() {
        PersonDiviser pd = new PersonDiviser(new ArrayList<>());

        List<Person> result = pd.getSeniors();

        assertThat(result).isEmpty();
    }

}
