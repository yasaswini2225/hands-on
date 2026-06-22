import java.util.Arrays;
import java.util.Comparator;
public class SearchTest {
    public static Product linearSearch(Product[] products, int targetId) {
        for (Product product : products) {
            if (product.productId == targetId) {
                return product;
            }
        }
        return null;
    }
    public static Product binarySearch(Product[] products, int targetId) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (products[mid].productId == targetId) {
                return products[mid];
            } else if (products[mid].productId < targetId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Product[] products = {
                new Product(103, "Laptop", "Electronics"),
                new Product(101, "Shoes", "Fashion"),
                new Product(105, "Phone", "Electronics"),
                new Product(102, "Watch", "Accessories"),
                new Product(104, "Bag", "Fashion")
        };
        System.out.println("----- Linear Search -----");
        Product result1 = linearSearch(products, 102);
        if (result1 != null) {
            result1.display();
        } else {
            System.out.println("Product not found");
        }
        Product[] sortedProducts = Arrays.copyOf(products, products.length);
        Arrays.sort(sortedProducts, Comparator.comparingInt(p -> p.productId));
        System.out.println("\n----- Binary Search -----");
        Product result2 = binarySearch(sortedProducts, 102);
        if (result2 != null) {
            result2.display();
        } else {
            System.out.println("Product not found");
        }
    }
}