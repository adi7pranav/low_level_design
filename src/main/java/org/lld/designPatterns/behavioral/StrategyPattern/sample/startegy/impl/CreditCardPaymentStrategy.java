package org.lld.designPatterns.behavioral.StrategyPattern.sample.startegy.impl;

import org.lld.designPatterns.behavioral.StrategyPattern.sample.startegy.PaymentStrategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {

    @Override
    public String payAmount(String amount) {
        return "Paid Amount: " + amount + " via Credit Card";
    }
}
