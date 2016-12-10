public class Person {

    private int age;

    public Person(int age) {
        this.age = age;
        if (age < 0) {
            throw new IllegalArgumentException("Niepoprawna wartość: " + age);
        }
    }

    public int getAge() {
        return age;
    }
}
