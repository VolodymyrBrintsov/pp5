package pl.brintsovv.credit;
import org.junit.jupiter.api.Test;
import static  org.junit.jupiter.api.Assertions.*;

public class GreetingTest {
    @Test
    public void itGreetsUser(){
        //Arrange / Given
        String name = "Vova";
        Greeter greeter = new Greeter();

        //Act / When
        String greetingText = greeter.hello(name);

        //Assert /Then
        assertEquals("Hello Vova", greetingText);
    }
}
