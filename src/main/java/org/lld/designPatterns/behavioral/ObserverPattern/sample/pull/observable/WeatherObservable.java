package org.lld.designPatterns.behavioral.ObserverPattern.sample.pull.observable;

import org.lld.designPatterns.behavioral.ObserverPattern.sample.pull.observableData.WeatherObservableData;
import org.lld.designPatterns.behavioral.ObserverPattern.sample.pull.observer.WeatherObserver;

public interface WeatherObservable {

    void addObserver(WeatherObserver observer);

    void removeObserver(WeatherObserver observer);

    void notifyObservers();

    void setWeatherReading(WeatherObservableData weatherReading);

    WeatherObservableData getWeatherData();

}
