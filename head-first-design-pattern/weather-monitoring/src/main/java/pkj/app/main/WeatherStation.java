package pkj.app.main;

import pkj.app.weather.CurrentConditionsDisplay;
import pkj.app.weather.ForeCastDisplay;
import pkj.app.weather.StatisticsDisplay;
import pkj.app.weather.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay =
                new StatisticsDisplay(weatherData);
//        ForeCastDisplay foreCastDisplay =
//                new ForeCastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
