package pl.brintsovv.letters;

import org.junit.jupiter.api.Test;
import static  org.junit.jupiter.api.Assertions.*;

public class CharCounterTest {

    @Test
    public void ItCountsCharsInInput(){
        //A
        String input = "Ala ma kota";
        CharCounter charCounter = new CharCounter();
        //A
        int charCount = charCounter.count("a", input);
        //A
        assertEquals(4, charCount);
    }
}
