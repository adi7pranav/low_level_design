package org.lld.designPatterns.behavioral.ObserverPattern.sample.pull;

import org.lld.designPatterns.behavioral.ObserverPattern.sample.pull.observable.WeatherObservable;
import org.lld.designPatterns.behavioral.ObserverPattern.sample.pull.observable.impl.WeatherStation;
import org.lld.designPatterns.behavioral.ObserverPattern.sample.pull.observableData.WeatherObservableData;
import org.lld.designPatterns.behavioral.ObserverPattern.sample.pull.observer.WeatherObserver;
import org.lld.designPatterns.behavioral.ObserverPattern.sample.pull.observer.impl.MobileObserver;
import org.lld.designPatterns.behavioral.ObserverPattern.sample.pull.observer.impl.WebPageObserver;

public class ObserverPullMain {

    static void main() {
        //observable
        WeatherObservable weatherStation = new WeatherStation();
        System.out.println("\nSetting weather data at 1pm");
        weatherStation.setWeatherReading(new WeatherObservableData(50.5f, 21f));

        //observers
        WeatherObserver mobileObserver = new MobileObserver(weatherStation);
        System.out.println("\nmobileObserver Registered");

        System.out.println("\nSetting weather data at 2pm");
        weatherStation.setWeatherReading(new WeatherObservableData(51.5f, 22f));

        WeatherObserver webpageObserver = new WebPageObserver(weatherStation);
        System.out.println("\nwebpageObserver Registered");

        System.out.println("\nSetting weather data at 3pm");
        weatherStation.setWeatherReading(new WeatherObservableData(52.5f, 23f));

        System.out.println("\nNotifying all at 3.30pm");
        weatherStation.notifyObservers();

        System.out.println("\nSetting weather data at 4pm");
        weatherStation.setWeatherReading(new WeatherObservableData(53.5f, 24f));

        weatherStation.removeObserver(webpageObserver);
        System.out.println("\nwebpageObserver Un-Registered");
        System.out.println("\nSetting weather data at 5pm");
        weatherStation.setWeatherReading(new WeatherObservableData(54.5f, 25f));

        weatherStation.removeObserver(mobileObserver);
        System.out.println("\nmobileObserver Un-Registered");

        System.out.println("\nSetting weather data at 6pm");
        weatherStation.setWeatherReading(new WeatherObservableData(55.5f, 26f));



    }
}
