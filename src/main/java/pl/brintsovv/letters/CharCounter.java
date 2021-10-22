package pl.brintsovv.letters;

public class CharCounter {
    public int count(String a, String input) {
        return (int)input.toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .filter(c -> c.equals(a))
                .count();
    }
}
