package Linear;
import java.util.*;

public class Linear {
    public static void main(String[] args) {
        List<String> products = Arrays.asList("Laptop", "Mobile", "Headphones", "Charger", "Keyboard");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter product to search: ");
        String searchItem = sc.nextLine();

        boolean found = false;
        for (String product : products) {
            if (product.equalsIgnoreCase(searchItem)) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println(searchItem + " is available in the store.");
        else
            System.out.println(searchItem + " is not available.");
    }
}
