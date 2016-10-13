package org.xiao.patterns.observer.weather;

import java.util.Observable;

/**
 * 天气类
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/13 21:12
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        MeasurementsChanged();
    }

    private void MeasurementsChanged() {
        setChanged();
        notifyObservers();
    }

}
