package com.frodo.strategy;

public class CreditCardStrategy  implements PaymentStrategy {

    private String name;
    private String cardNumber;
    private String cvv;
    private String exppiry;

    public CreditCardStrategy(String nm, String ccNum, String cvv, String expiryDate){
        this.name=nm;
        this.cardNumber=ccNum;
        this.cvv=cvv;
        this.exppiry =expiryDate;
    }

    @Override
    public void excute(int amount) {
        System.out.println(amount +" pay with  cc");
    }

    public String toString() {
        return "creditcard";
    }
}
