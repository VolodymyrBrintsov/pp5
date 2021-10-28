package pl.brintsovv.credit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.BitSet;

import static  org.junit.jupiter.api.Assertions.*;

public class CreditCardTest {
    @Test
    public void itAllowsAssignLimitToCC(){
        CreditCard card = thereIsCreditCard();
        card.assignLimit(BigDecimal.valueOf(200));
        assertEquals(BigDecimal.valueOf(200), card.getCurrentLimit());
    }

    @Test
    public void itIsNotPossibleToAssignLimitBelowThreshold(){
        CreditCard card = thereIsCreditCard();
        try{
            card.assignLimit(BigDecimal.valueOf(50));
            Assertions.fail("Exception should be thrown");
        } catch (CreditLimitBelowLimitValue e){
            assertTrue(true);
        }
    }

    private CreditCard thereIsCreditCard() {
        return new CreditCard("1234-5678");
    }

    @Test
    public void itAllowToCheckCurrentBalence(){
        CreditCard card = thereIsCreditCard();
        card.assignLimit(BigDecimal.valueOf(1000));
        card.withdraw(BigDecimal.valueOf(500));
        card.withdraw(BigDecimal.valueOf(500));
        assertThrows(NotEnoughMoneyException.class, () -> {
            card.withdraw(BigDecimal.valueOf(500));
        });
    }

}
