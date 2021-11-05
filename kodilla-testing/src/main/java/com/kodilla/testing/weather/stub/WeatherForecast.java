package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;


    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;


    }

    public double calculateAverageTempertures()
    {
        double averageTemperatures = 0.0;

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()){
            averageTemperatures += temperature.getValue();
        }
            averageTemperatures /= temperatures.getTemperatures().size();
            return averageTemperatures;

    }
    public double calculateMedianeTempertures() {
        List<Double> temperaturesList = new ArrayList<>(temperatures.getTemperatures().values());
        Collections.sort(temperaturesList);

        if (temperaturesList.size() %2 != 0) {
            return temperaturesList.get(temperaturesList.size() / 2);
        } else {
            double a = temperaturesList.get(temperaturesList.size() / 2);
            double b = temperaturesList.get((temperaturesList.size() / 2) - 1);
            return ((a + b) / 2.0);
        }
    }


}