package org.lld.designPatterns.behavioral.StrategyPattern.sample;

import org.lld.designPatterns.behavioral.StrategyPattern.sample.enums.PaymentStrategies;
import org.lld.designPatterns.behavioral.StrategyPattern.sample.startegy.PaymentStrategy;
import org.lld.designPatterns.behavioral.StrategyPattern.sample.startegy.PaymentStrategyRegistry;

public class StrategyMain {

//    static PaymentStrategyRegistry paymentStrategyRegistry;

    static void main() {

        PaymentStrategy debitCardStrategy = PaymentStrategyRegistry.getPaymentStrategy(PaymentStrategies.DEBIT_CARD);
        Payment debitCardPayment = new Payment(debitCardStrategy);

        PaymentStrategy creditCardStrategy = PaymentStrategyRegistry.getPaymentStrategy(PaymentStrategies.CREDIT_CARD);
        Payment creditCardPayment = new Payment(creditCardStrategy);

        PaymentStrategy upiStrategy = PaymentStrategyRegistry.getPaymentStrategy(PaymentStrategies.UPI);
        Payment upiPayment = new Payment(upiStrategy);

        String debitCardPaid = debitCardPayment.makePayment("5000");
        System.out.println(debitCardPaid);

        String creditCardPaid = creditCardPayment.makePayment("9000");
        System.out.println(creditCardPaid);

        String upiPaid = upiPayment.makePayment("1000");
        System.out.println(upiPaid);
    }
}
