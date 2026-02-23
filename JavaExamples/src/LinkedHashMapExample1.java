import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample1 {
    private LinkedHashMap<String, String> recentlyViewedProducts;

    public LinkedHashMapExample1() {
        // Limit the size to 5 items to keep only the latest 5 viewed products
        recentlyViewedProducts = new LinkedHashMap<String, String>(5, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<String, String> eldest) {
                // If the size exceeds 5, remove the oldest entry
                return size() > 5;
            }
        };
    }

    // Method to add a recently viewed product
    public void viewProduct(String productId, String productName) {
        recentlyViewedProducts.put(productId, productName); 
    }

    // Method to display the recently viewed products
    public void displayRecentlyViewed() {
        System.out.println("Recently Viewed Products:");
        for (Map.Entry<String, String> entry : recentlyViewedProducts.entrySet()) {
            System.out.println("Product ID: " + entry.getKey() + ", Product Name: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        LinkedHashMapExample1 recentlyViewed = new LinkedHashMapExample1();

        // Simulating the user viewing products
        recentlyViewed.viewProduct("101", "Smartphone");
        recentlyViewed.viewProduct("102", "Laptop");
        recentlyViewed.viewProduct("103", "Headphones");
        recentlyViewed.viewProduct("104", "Camera");
        recentlyViewed.viewProduct("105", "Tablet");

        // Displaying the products after first set of views
        recentlyViewed.displayRecentlyViewed();

        // Simulating user viewing another product (removes the oldest product,
        // "Smartphone")
        recentlyViewed.viewProduct("106", "Smartwatch");

        // Displaying the products after viewing another product
        recentlyViewed.displayRecentlyViewed();
    }
}
