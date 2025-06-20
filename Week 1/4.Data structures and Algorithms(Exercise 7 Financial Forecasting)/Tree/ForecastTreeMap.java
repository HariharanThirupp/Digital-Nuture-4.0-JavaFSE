import java.util.*;

public class ForecastTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, Double> forecast = new TreeMap<>();
        forecast.put(2023, 100000.0);
        forecast.put(2025, 180000.0);
        forecast.put(2024, 130000.0);
        forecast.put(2026, 210000.0);

        System.out.println("Sorted Financial Forecast:");
        for (Map.Entry<Integer, Double> entry : forecast.entrySet()) {
            System.out.println(entry.getKey() + " → ₹" + entry.getValue());
        }
    }
}
