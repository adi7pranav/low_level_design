package org.lld.designPatterns.behavioral.ObserverPattern.sample.pull.observableData;

public class WeatherObservableData {
    private final float humidity;
    private final float temperature;

    @Override
    public String toString() {
        return "WeatherObservableData{" +
                "humidity=" + humidity +
                ", temperature=" + temperature +
                '}';
    }

    public WeatherObservableData(float humidity, float temperature) {
        this.humidity = humidity;
        this.temperature = temperature;
    }
}
