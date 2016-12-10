import org.junit.Test;

public class PersonTest {

    @Test(expected = IllegalArgumentException.class)
    public void shouldReturnExceptionIfInputIsLessThan0() {
        Person p = new Person(-1);
    }
}
