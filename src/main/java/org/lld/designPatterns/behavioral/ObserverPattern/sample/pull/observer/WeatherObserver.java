package org.lld.designPatterns.behavioral.ObserverPattern.sample.pull.observer;

import org.lld.designPatterns.behavioral.ObserverPattern.sample.pull.observableData.WeatherObservableData;

public interface WeatherObserver {

    void update(WeatherObservableData weatherObservableData);

}
