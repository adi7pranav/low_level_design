package org.lld.designPatterns.behavioral.ObserverPattern.sample.push.observer;

import org.lld.designPatterns.behavioral.ObserverPattern.sample.push.observableData.WeatherObservableData;

public interface WeatherObserver {

    void update(WeatherObservableData weatherObservableData);

}
