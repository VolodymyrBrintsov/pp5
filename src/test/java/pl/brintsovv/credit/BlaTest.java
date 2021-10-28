package pl.brintsovv.credit;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class BlaTest {
    @Test
    public void itHandleMultipleCardWithdraws() {
        String card1Number = thereIsCardWithLimit(1000);
        String card2Number = thereIsCardWithLimit(2000);

        CardApi cardApi1 = thereIsCardApi();
        cardApi1.handleWithdraws(card1Number, BigDecimal.valueOf(500));
        cardApi1.handleWithdraws(card2Number, BigDecimal.valueOf(1000));

        cardBalanceEquals(card1Number, BigDecimal.valueOf(500));
        cardBalanceEquals(card1Number, BigDecimal.valueOf(1000));

    }
    private void cardBalanceEquals(String number, BigDecimal i){

    }

    private CardApi thereIsCardApi() {
        return new CardApi();
    }

    private String thereIsCardWithLimit(int i) {
        return null;
    }
    
}
