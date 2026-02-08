package org.lld.designPatterns.behavioral.StrategyPattern.sample.startegy;

import org.lld.designPatterns.behavioral.StrategyPattern.sample.enums.PaymentStrategies;
import org.lld.designPatterns.behavioral.StrategyPattern.sample.startegy.impl.CreditCardPaymentStrategy;
import org.lld.designPatterns.behavioral.StrategyPattern.sample.startegy.impl.DebitCardPaymentStrategy;
import org.lld.designPatterns.behavioral.StrategyPattern.sample.startegy.impl.UpiPaymentStrategy;

import java.util.HashMap;
import java.util.Map;

public class PaymentStrategyRegistry {

    private static final Map<PaymentStrategies, PaymentStrategy> paymentStrategyRegistry =
            Map.of(
                    PaymentStrategies.UPI, new UpiPaymentStrategy(),
                    PaymentStrategies.CREDIT_CARD, new CreditCardPaymentStrategy(),
                    PaymentStrategies.DEBIT_CARD, new DebitCardPaymentStrategy()
            );

    public static PaymentStrategy getPaymentStrategy(PaymentStrategies paymentStrategy){
        PaymentStrategy strategy =  paymentStrategyRegistry.get(paymentStrategy);
        if(strategy == null) {
            throw new RuntimeException("Strategy" + paymentStrategy.name() + "not registered");
        }
        return strategy;
    }
}
