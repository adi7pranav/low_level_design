package org.lld.designPatterns.behavioral.StrategyPattern.sample.startegy.impl;

import org.lld.designPatterns.behavioral.StrategyPattern.sample.startegy.PaymentStrategy;

public class DebitCardPaymentStrategy implements PaymentStrategy {

    @Override
    public String payAmount(String amount) {
        return "Paid Amount: " + amount + " via Debit Card";
    }
}
