package HashMap;

import java.util.*;

public class ProductSearchHashMap {
    public static void main(String[] args) {
        Map<Integer, String> productMap = new HashMap<>();
        productMap.put(101, "Laptop");
        productMap.put(102, "Mouse");
        productMap.put(103, "Monitor");
        productMap.put(104, "Keyboard");
        productMap.put(105, "Webcam");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product ID to search: ");
        int productId = sc.nextInt();

        if (productMap.containsKey(productId)) {
            System.out.println("Product Found: " + productMap.get(productId));
        } else {
            System.out.println("Product ID not found.");
        }
    }
}
