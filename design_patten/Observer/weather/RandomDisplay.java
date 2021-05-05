package weather;

public class RandomDisplay implements Observer,DisplayElement{

    private float randomValue;
    private Subject weatherDate;

    public RandomDisplay(WeatherData weatherData){
        this.weatherDate = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.randomValue = temp * 3 + humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("randomValue: "+randomValue);

    }
}
