package pl.brintsovv.credit;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static  org.junit.jupiter.api.Assertions.*;

public class CreditCardTest {
    @Test
    public void itAllowsAssignLimitToCC(){
        CreditCard card = new CreditCard("1234-5678");
        card.assignLimit(200);
        assertEquals(200, card.getCurrentLimit());
    }

    @Test
    public void testNumbers(){
        BigDecimal d1 = BigDecimal.valueOf(0.03);
        BigDecimal d2 = BigDecimal.valueOf(0.02);

        System.out.println(d1.subtract(d2));
    }
}
