import java.util.*;

public class YearlyForecastHashMap {
    public static void main(String[] args) {
        HashMap<Integer, Double> yearlyProfits = new HashMap<>();
        yearlyProfits.put(2024, 150000.0);
        yearlyProfits.put(2025, 180000.0);
        yearlyProfits.put(2026, 210000.0);
        yearlyProfits.put(2027, 250000.0);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year to forecast: ");
        int year = sc.nextInt();

        if (yearlyProfits.containsKey(year)) {
            System.out.println("Projected Profit for " + year + ": ₹" + yearlyProfits.get(year));
        } else {
            System.out.println("No data available for " + year);
        }
    }
}
