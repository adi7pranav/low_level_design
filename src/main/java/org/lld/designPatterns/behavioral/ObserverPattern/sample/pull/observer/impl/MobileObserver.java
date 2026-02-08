package org.lld.designPatterns.behavioral.ObserverPattern.sample.pull.observer.impl;

import org.lld.designPatterns.behavioral.ObserverPattern.sample.pull.observable.WeatherObservable;
import org.lld.designPatterns.behavioral.ObserverPattern.sample.pull.observableData.WeatherObservableData;
import org.lld.designPatterns.behavioral.ObserverPattern.sample.pull.observer.WeatherObserver;

public class MobileObserver implements WeatherObserver {

    WeatherObservable weatherObservable;

    public MobileObserver(WeatherObservable weatherObservable) {
        this.weatherObservable = weatherObservable;
        weatherObservable.addObserver(this);
    }

    @Override
    public void update(WeatherObservableData weatherObservableData) {
        System.out.println("Weather data updated to mobile: " + weatherObservableData.toString());
    }
}
