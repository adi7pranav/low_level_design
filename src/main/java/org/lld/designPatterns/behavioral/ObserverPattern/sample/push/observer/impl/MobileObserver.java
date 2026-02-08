package org.lld.designPatterns.behavioral.ObserverPattern.sample.push.observer.impl;

import org.lld.designPatterns.behavioral.ObserverPattern.sample.push.observableData.WeatherObservableData;
import org.lld.designPatterns.behavioral.ObserverPattern.sample.push.observer.WeatherObserver;

public class MobileObserver implements WeatherObserver {

    @Override
    public void update(WeatherObservableData weatherObservableData) {
        System.out.println("Weather data updated to mobile: " + weatherObservableData.toString());
    }
}
