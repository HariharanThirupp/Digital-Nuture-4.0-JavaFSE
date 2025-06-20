import java.util.*;

public class ProductBinarySearch {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("TV", 25000));
        products.add(new Product("Fridge", 30000));
        products.add(new Product("Oven", 8000));
        products.add(new Product("AC", 40000));
        products.add(new Product("Washing Machine", 22000));

        Collections.sort(products); // Sort by name

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product name to search: ");
        String target = sc.nextLine();

        int index = Collections.binarySearch(products, new Product(target, 0));

        if (index >= 0) {
            System.out.println("Found: " + products.get(index));
        } else {
            System.out.println("Product not found.");
        }
    }
}
