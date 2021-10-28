package pl.brintsovv.credit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static  org.junit.jupiter.api.Assertions.*;

public class CreditCardTest {
    @Test
    public void itAllowsAssignLimitToCC(){
        CreditCard card = new CreditCard("1234-5678");
        card.assignLimit(BigDecimal.valueOf(200));
        assertEquals(BigDecimal.valueOf(200), card.getCurrentLimit());
    }

    @Test
    public void itIsNotPossibleToAssignLimitBelowThreshold(){
        CreditCard card = new CreditCard("1234-5678");
        try{
            card.assignLimit(BigDecimal.valueOf(50));
            Assertions.fail("Exception should be thrown");
        } catch (CreditLimitBelowLimitValue e){
            assertTrue(true);
        }
    }
}
