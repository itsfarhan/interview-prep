import java.util.*;
import java.util.stream.Collectors;

class Order {
    private String orderId;
    private String customerId;
    private double amount;
    private String status;
    private String category;

    public Order(String orderId, String customerId, double amount, String status, String category) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.amount = amount;
        this.status = status;
        this.category = category;
    }

    // Getters
    public String getOrderId() {
        return orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Order{id='" + orderId + "', customer='" + customerId +
                "', amount=" + amount + ", status='" + status + "', category='" + category + "'}";
    }
}

public class MultipleStreamOpsExample {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order("ORD001", "CUST001", 150.0, "COMPLETED", "Electronics"),
                new Order("ORD002", "CUST002", 75.0, "PENDING", "Books"),
                new Order("ORD003", "CUST001", 200.0, "COMPLETED", "Electronics"),
                new Order("ORD004", "CUST003", 50.0, "CANCELLED", "Books"),
                new Order("ORD005", "CUST002", 300.0, "COMPLETED", "Clothing"),
                new Order("ORD006", "CUST004", 120.0, "COMPLETED", "Electronics"));

        System.out.println("=== Order Processing Analysis ===\n");

        // 1. Get completed orders sorted by amount (descending)
        List<Order> completedOrders = orders.stream()
                .filter(order -> "COMPLETED".equals(order.getStatus()))
                .sorted(Comparator.comparing(Order::getAmount).reversed())
                .collect(Collectors.toList());

        System.out.println("Completed orders (sorted by amount desc):");
        completedOrders.forEach(System.out::println);

        // 2. Calculate total revenue from completed orders
        double totalRevenue = orders.stream()
                .filter(order -> "COMPLETED".equals(order.getStatus()))
                .mapToDouble(Order::getAmount)
                .reduce(0.0, Double::sum);

        System.out.println("\nTotal revenue from completed orders: $" + totalRevenue);

        // 3. Get unique customer IDs who made completed orders
        List<String> activeCustomers = orders.stream()
                .filter(order -> "COMPLETED".equals(order.getStatus()))
                .map(Order::getCustomerId)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Active customers: " + activeCustomers);

        // 4. Get average order amount by category for completed orders
        Map<String, Double> avgAmountByCategory = orders.stream()
                .filter(order -> "COMPLETED".equals(order.getStatus()))
                .collect(Collectors.groupingBy(
                        Order::getCategory,
                        Collectors.averagingDouble(Order::getAmount)));

        System.out.println("Average order amount by category:");
        avgAmountByCategory
                .forEach((category, avg) -> System.out.println(category + ": $" + String.format("%.2f", avg)));

        // 5. Find top 3 highest value completed orders
        List<Order> top3Orders = orders.stream()
                .filter(order -> "COMPLETED".equals(order.getStatus()))
                .sorted(Comparator.comparing(Order::getAmount).reversed())
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("\nTop 3 highest value orders:");
        top3Orders.forEach(System.out::println);
    }
}