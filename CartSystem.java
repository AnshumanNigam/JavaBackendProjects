
import java.util.ArrayList;
import java.util.List;

public class CartSystem{
    public static class Product {
        private String productId;
        private String productName;
        private double price;
        private int quantity;

        public Product(String productId, String productName, double price, int quantity) {
            this.productId = productId;
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
        }

        public String getProductId() {
            return productId;
        }

        public void setProductId(String productId) {
            this.productId = productId;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    }

    public static class Cart {
        private List cartItems;
        public Cart() {
            cartItems = new ArrayList<>();
        }
        public void addToCart(Product product) {
            cartItems.add(product);
            System.out.println("Product added to cart---> " + product.getProductName());
        }
        public void removeFromCart(Product product) {
            cartItems.remove(product);
            System.out.println("Product removed from cart---> " + product.getProductName());
        }
        public void updateQuantity(Product product, int quantity) {
            product.setQuantity(quantity);
            System.out.println("Quantity updated for---> " + product.getProductName() + " " + quantity);
        }
        public void viewCart() {
            if (cartItems.isEmpty()) {
                System.out.println("Your cart is empty");
            } else {
                System.out.println("Cart Items: ");
                for (Product product : cartItems) {
                    System.out.println("Product: " + product.getProductName() + ", Quantity: " + product.getQuantity() + " Price: " + product.getPrice());
                }
            }
        }

        }


    public static void main(String[] args) {
        Product product1 = new Product("5000", "Jeans", 2500, 2);
        Product product2 = new Product("5120", "Guitar", 10000, 1);

        Cart cart = new Cart();

        cart.addToCart(product1);
        cart.addToCart(product2);

        cart.viewCart();

        cart.updateQuantity(product1, 15);

        cart.removeFromCart(product2);

        cart.viewCart();

    }
}
