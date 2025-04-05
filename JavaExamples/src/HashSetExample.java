// Time Complexity:
// ● Access: O(1)
// ● Search: O(1)
// ● Insert: O(1)
// ● Remove: O(1)

import java.util.HashSet;

class EcommerceSystem{
    private HashSet<String> productIDs;

    public EcommerceSystem(){
        productIDs = new HashSet<>();
    }

    public void addProductID(String productID){
        if (productIDs.add(productID)){
            System.out.println("productID added are: "+productID);
        }else{
            System.out.println("Duplicate productID found: "+productID);
        }
    }

    public void displayProductIDs(){
        System.out.println("All Unique product IDs are :"+productIDs);
    }

    public void removeProductID(String productID){
        if(productIDs.contains(productID)){
            productIDs.remove(productID);
        }
        else{
            System.out.println("Product ID not found");
        }
    }
}

public class HashSetExample{
    public static void main(String[] args) {
        EcommerceSystem ecommerceSystem = new EcommerceSystem();

        //adding productids to the set.
        ecommerceSystem.addProductID("A001");
        ecommerceSystem.addProductID("A002");
        ecommerceSystem.addProductID("A003");
        ecommerceSystem.addProductID("A004");
        ecommerceSystem.addProductID("A005");

        //display product IDs
        ecommerceSystem.displayProductIDs();

        //checking if duplicate condition works
        ecommerceSystem.addProductID("A001");

        // Removing product ID; if you enter product ID that is not in the set will give you output - Product ID not found.
        ecommerceSystem.removeProductID("A005");

        //display product IDs
        ecommerceSystem.displayProductIDs();

    }
}