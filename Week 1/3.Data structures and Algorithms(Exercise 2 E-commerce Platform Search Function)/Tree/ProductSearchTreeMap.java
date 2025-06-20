import java.util.*;

public class ProductSearchTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Double> productPrices = new TreeMap<>();
        productPrices.put("AirPods", 199.99);
        productPrices.put("Bluetooth Speaker", 49.99);
        productPrices.put("Camera", 799.99);
        productPrices.put("Drone", 999.99);
        productPrices.put("Earphones", 19.99);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product name to search: ");
        String name = sc.nextLine();

        if (productPrices.containsKey(name)) {
            System.out.println(name + " is available at ₹" + productPrices.get(name));
        } else {
            System.out.println(name + " is not available.");
        }

        // Displaying all products in sorted order
        System.out.println("\nAll available products:");
        for (Map.Entry<String, Double> entry : productPrices.entrySet()) {
            System.out.println(entry.getKey() + ": ₹" + entry.getValue());
        }
    }
}
