package org.lld.designPatterns.behavioral.ObserverPattern.sample.push.observable;

import org.lld.designPatterns.behavioral.ObserverPattern.sample.push.observableData.WeatherObservableData;
import org.lld.designPatterns.behavioral.ObserverPattern.sample.push.observer.WeatherObserver;

public interface WeatherObservable {

    void addObserver(WeatherObserver observer);

    void removeObserver(WeatherObserver observer);

    void notifyObservers();

    void setWeatherReading(WeatherObservableData weatherReading);

}
