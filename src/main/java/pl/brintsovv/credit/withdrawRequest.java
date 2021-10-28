package pl.brintsovv.credit;

import java.math.BigDecimal;

public class withdrawRequest {
    private final String number;
    private final BigDecimal money;

    public withdrawRequest(String number, BigDecimal money){
        this.money = money;
        this.number = number;
    }
    public String getNumber(){return number;}
}
