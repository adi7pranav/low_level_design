package org.lld.designPatterns.behavioral.StrategyPattern.sample;

import org.lld.designPatterns.behavioral.StrategyPattern.sample.startegy.PaymentStrategy;

public class Payment {
    private final PaymentStrategy paymentStrategy;

    public Payment(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public String makePayment(String amount){
        return paymentStrategy.payAmount(amount);
    }
}
