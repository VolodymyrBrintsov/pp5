package pl.brintsov.greetings;

public class Greeter {
    public String hello(String name) {
        return String.format("Hello %s",name);
        //return "Hello " + name;
    }
}
