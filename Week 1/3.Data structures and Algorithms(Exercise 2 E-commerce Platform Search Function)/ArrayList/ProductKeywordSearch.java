import java.util.*;

public class ProductKeywordSearch {
    public static void main(String[] args) {
        List<String> products = Arrays.asList( "Wireless Mouse", "Mouse Pad", "Gaming Keyboard", "Mechanical Keyboard", "Gaming Mouse");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter keyword to filter products: ");
        String keyword = sc.nextLine().toLowerCase();

        System.out.println("\nSearch results:");
        boolean found = false;
        for (String product : products) {
            if (product.toLowerCase().contains(keyword)) {
                System.out.println("- " + product);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching products found.");
        }
    }
}
