package weather;

import java.util.*;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
	
		CurrentConditionsDisplay currentDisplay =
			new CurrentConditionsDisplay(weatherData);

		//Regiser those classes to observer
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		HeatDisplay heatDisplay = new HeatDisplay(weatherData);
		weatherData.setMeasurements(78, 90, 29.2f);
		ConvertTemperatureDisplay convertDisplay = new ConvertTemperatureDisplay(weatherData);
		RandomDisplay randomDisplay = new RandomDisplay(weatherData);

		weatherData.removeObserver(randomDisplay);
		//delete randomDisplay from observer

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);

	}
}
