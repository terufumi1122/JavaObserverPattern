public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherData);
//        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
//        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(27, 54, 30.5f);
        weatherData.setMeasurements(25, 70, 33.5f);
        weatherData.setMeasurements(26, 90, 29.5f);
    }
}
