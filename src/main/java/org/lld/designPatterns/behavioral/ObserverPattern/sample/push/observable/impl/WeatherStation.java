package org.lld.designPatterns.behavioral.ObserverPattern.sample.push.observable.impl;

import org.lld.designPatterns.behavioral.ObserverPattern.sample.push.observable.WeatherObservable;
import org.lld.designPatterns.behavioral.ObserverPattern.sample.push.observableData.WeatherObservableData;
import org.lld.designPatterns.behavioral.ObserverPattern.sample.push.observer.WeatherObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WeatherStation implements WeatherObservable {

    List<WeatherObserver> observerList = new ArrayList<>();
    WeatherObservableData weatherData;

    @Override
    public void addObserver(WeatherObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(WeatherObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        if(observerList == null || observerList.isEmpty()){
            System.out.println("No observers to push data");
            return;
        }
        for(WeatherObserver observer : observerList){
            observer.update(weatherData);
        }
    }

    @Override
    public void setWeatherReading(WeatherObservableData weatherData){
        this.weatherData = weatherData;
        notifyObservers();
    }
}
