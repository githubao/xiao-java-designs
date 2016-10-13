package org.xiao.patterns.observer.weather;

import org.junit.Test;

/**
 * 天气类测试
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/13 21:35
 */
public class WeatherDataTest {

    @Test
    public void test() {
        WeatherData weatherData = new WeatherData();

        new ForecastDisplay(weatherData);
        new CurrentDisplay(weatherData);

        weatherData.setMeasurements(1, 2, 3);
        weatherData.setMeasurements(4, 5, 6);


    }
}
