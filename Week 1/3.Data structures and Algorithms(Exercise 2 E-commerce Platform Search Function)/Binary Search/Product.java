public class Product implements Comparable<Product> {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public int compareTo(Product other) {
        return this.name.compareToIgnoreCase(other.name);
    }

    public String toString() {
        return name + " - ₹" + price;
    }
}
