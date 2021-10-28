package pl.brintsovv.credit;

import java.math.BigDecimal;

public class CreditCard {
    private final String cardNumber;
    private BigDecimal cardLimit;

    public CreditCard(String cardNumber){
        this.cardNumber = cardNumber;
    }

    public void assignLimit(BigDecimal i) {
        System.out.println(i.compareTo(BigDecimal.valueOf(100)));
        if (isBelowCreditLimit(i)){
            throw new CreditLimitBelowLimitValue();
        }
        else {
            this.cardLimit = i;
        }
    }

    private boolean isBelowCreditLimit(BigDecimal i) {
        return i.compareTo(BigDecimal.valueOf(100)) < 0;
    }

    public BigDecimal getCurrentLimit() {
        return this.cardLimit;
    }
}
