import java.util.*;

public class MonthlyProfitForecast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> monthlyProfits = new ArrayList<>();

        System.out.println("Enter projected profits for the next 6 months:");
        for (int i = 1; i <= 6; i++) {
            System.out.print("Month " + i + ": ₹");
            double profit = sc.nextDouble();
            monthlyProfits.add(profit);
        }

        double total = 0;
        System.out.println("\nMonthly Profit Report:");
        for (int i = 0; i < monthlyProfits.size(); i++) {
            double profit = monthlyProfits.get(i);
            System.out.println("Month " + (i + 1) + ": ₹" + profit);
            total += profit;
        }

        System.out.printf("\nTotal Profit: ₹%.2f%n", total);
        System.out.printf("Average Monthly Profit: ₹%.2f%n", total / monthlyProfits.size());
    }
}
