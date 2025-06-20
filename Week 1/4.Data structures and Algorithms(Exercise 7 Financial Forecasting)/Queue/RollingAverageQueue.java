import java.util.*;

public class RollingAverageQueue {
    public static void main(String[] args) {
        Queue<Double> profits = new LinkedList<>();
        profits.add(5000.0);
        profits.add(6000.0);
        profits.add(7000.0);

        double sum = 0;
        for (double p : profits) sum += p;

        System.out.println("Initial Rolling Average (3 months): ₹" + (sum / 3));

        
        profits.poll();       
        profits.add(8000.0);   
        sum = 6000 + 7000 + 8000;

        System.out.println("Updated Rolling Average (Mar-Apr-May): ₹" + (sum / 3));
    }
}
