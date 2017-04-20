package org.xiao.patterns.ch02observer.weather;

import java.util.Observable;
import java.util.Observer;

/**
 * 当前天气情况
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/13 21:19
 */
public class CurrentDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public CurrentDisplay() {
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println(String.format("temperature: %s, humidity: %s.", temperature, humidity));
    }
}
