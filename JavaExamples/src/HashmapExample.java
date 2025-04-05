import java.util.HashMap;

class EcommerceOrderTrack{
    String status;
    String deliveryDate;
    double totalPrice;

    public EcommerceOrderTrack(String status, String deliveryDate, double totalPrice) {
        this.status = status;
        this.deliveryDate = deliveryDate;
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "EcommerceOrderTrack [status=" + status + ", deliveryDate=" + deliveryDate + ", totalPrice=" + totalPrice
                + "]";
    }
}

public class HashmapExample {
    public static void main(String[] args) {
        HashMap<String, EcommerceOrderTrack> orderMap = new HashMap<>();
        
        orderMap.put("ORDER123", new EcommerceOrderTrack("Dispatched", "2024-12-12", 250.0));
        orderMap.put("ORDER124", new EcommerceOrderTrack("Delivered", "2024-10-05", 120.99));
        orderMap.put("ORDER125", new EcommerceOrderTrack("Processing", "2024-10-10", 320.00));

        String orderID = "ORDER124";
        if (orderMap.containsKey(orderID)){
            EcommerceOrderTrack orderDetails = orderMap.get(orderID);
            System.out.println("Order details for "+ orderID + ": "+orderDetails);
        }else{
            System.out.println("Order ID: " + orderID +" not found.");
        }

        System.out.println("\nAll Orders");
        for (String id : orderMap.keySet()) {
            System.out.println("Order ID: "+ id +", Details: " + orderMap.get(id));
        }
    }
}
