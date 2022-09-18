package pkj.app.weather;

public class StatisticsDisplay implements Observer, DisplayElement {
    private final Subject weatherData;
    private float temperature;
    private float humidity;
    private float pressure;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + getAvg(this.temperature, temperature)+"/"
        + getMax(this.temperature, temperature)+"/"+ getMin(this.temperature, temperature) + "\n");
    }

    private float getAvg(float a, float b) {
        return (a + b) / 2;
    }

    private float getMax(float a, float b) {
        return Math.max(a, b);
    }

    private float getMin(float a, float b) {
        return Math.min(a, b);
    }
}
