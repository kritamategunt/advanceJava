package weather;

public class ConvertTemperatureDisplay implements DisplayElement,Observer {
    private float calvinValue;
    private float fahrenheitValue;
    private Subject weatherData;

    public ConvertTemperatureDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.calvinValue = 273 + temp;
        this.fahrenheitValue = 10 + temp;
        display();
    }

    @Override
    public void display() {
        System.out.println("Calvin "+ calvinValue);
        System.out.println("Fahrenheit "+ fahrenheitValue);

    }
}
