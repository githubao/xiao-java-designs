package org.xiao.patterns.observer.weather;

import java.util.Observable;
import java.util.Observer;

/**
 * 天气预测
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/13 21:26
 */
public class ForecastDisplay implements Observer, DisplayElement {
    Observable observable;
    private float pressure;

    public ForecastDisplay() {
    }

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println(String.format("pressure, %s.", pressure));
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            pressure = weatherData.getPressure();
            display();
        }
    }
}
