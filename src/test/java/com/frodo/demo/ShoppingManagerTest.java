package com.frodo.demo;

import com.frodo.strategy.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShoppingManagerTest {

    @Test
    public void testShoppingManager() {

        Item item1 = new Item("sting",10);
        Item item2 = new Item("glamdring",40);

        //excute by paypal
        PaymentStrategy strategy = new PaypalStrategy("frodo@mordor.com", "ilovesauron");

        ShoppingManager shoppingManager = new ShoppingManager(strategy);

        shoppingManager.addItem(item1);
        shoppingManager.addItem(item2);
        shoppingManager.pay();

        int total = shoppingManager.calculateTotal();
        assertEquals("50", String.valueOf(total));


        //excute by credit card
        PaymentStrategy strategy2 = new CreditCardStrategy("Frodo Baggins", "123", "33", "third age");
        shoppingManager.setStrategy(strategy2);
        //and lets add some more items
        shoppingManager.addItem(item1);
        shoppingManager.addItem(item2);
        shoppingManager.pay();

        total = shoppingManager.calculateTotal();
        assertEquals("100", String.valueOf(total));


    }
}
