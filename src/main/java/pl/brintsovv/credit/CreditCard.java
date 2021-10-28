package pl.brintsovv.credit;

public class CreditCard {
    private final String cardNumber;
    int cardLimit = 100;

    public CreditCard(String cardNumber){
        this.cardNumber = cardNumber;
    }

    public void assignLimit(int i) {
        this.cardLimit = i;
    }

    public int getCurrentLimit() {
        return this.cardLimit;
    }
}
