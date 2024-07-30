import java.util.HashMap;

public class InventoryManagementSystem {
    private HashMap<Integer, Product> products;

    public InventoryManagementSystem() {
        this.products = new HashMap<>();
    }

    public void addProduct(Product product) {
        if (products.containsKey(product.getProductId())) {
            System.out.println("Product with ID " + product.getProductId() + " already exists.");
        } else {
            products.put(product.getProductId(), product);
        }
    }

    public void updateProduct(int productId, String productName, Integer quantity, Double price) {
        Product product = products.get(productId);
        if (product != null) {
            if (productName != null) product.setProductName(productName);
            if (quantity != null) product.setQuantity(quantity);
            if (price != null) product.setPrice(price);
        } else {
            System.out.println("Product with ID " + productId + " not found.");
        }
    }

    public void deleteProduct(int productId) {
        if (products.containsKey(productId)) {
            products.remove(productId);
        } else {
            System.out.println("Product with ID " + productId + " not found.");
        }
    }

    public void viewInventory() {
        for (Product product : products.values()) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();
        
        // Adding products
        ims.addProduct(new Product(1, "Laptop", 10, 1500.00));
        ims.addProduct(new Product(2, "Smartphone", 20, 800.00));
        
        // Viewing inventory
        ims.viewInventory();
        
        // Updating a product
        ims.updateProduct(1, "Gaming Laptop", 8, 1600.00);
        
        // Deleting a product
        ims.deleteProduct(2);
        
        // Viewing inventory again
        ims.viewInventory();
    }
}

