package pl.brintsovv.credit;

import java.math.BigDecimal;

public class CreditCard {
    private final String cardNumber;
    private BigDecimal cardLimit;
    private BigDecimal balance;

    public CreditCard(String cardNumber){
        this.cardNumber = cardNumber;
    }

    public void assignLimit(BigDecimal i) {
        if (isBelowCreditLimit(i)){
            throw new CreditLimitBelowLimitValue();
        }
        else {
            this.cardLimit = i;
            this.balance = i;
        }
    }

    private boolean isBelowCreditLimit(BigDecimal i) {
        return i.compareTo(BigDecimal.valueOf(100)) < 0;
    }

    public BigDecimal getCurrentLimit() {
        return this.cardLimit;
    }

    public void withdraw(BigDecimal i) {
        if (i.compareTo(balance) < 0){
            throw new NotEnoughMoneyException();
        }
        this.balance = this.balance.subtract(i);

    }

    public BigDecimal getBalance() {
        return this.balance;
    }
}
