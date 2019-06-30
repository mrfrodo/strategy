package com.frodo.strategy;

public class PaypalStrategy implements PaymentStrategy  {

    private String emailId;
    private String password;

    public PaypalStrategy(String email, String pw){
        this.emailId=email;
        this.password=pw;
    }

    @Override
    public void excute(int amount) {
        System.out.println(amount + " paid using Paypal.");
    }

    public String toString() {
        return "paypal";
    }
}
