public class BagDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        testAdd(cart);
        displayBag(cart);
    }


    public static void testAdd(ShoppingCart cart){
        System.out.println("Adding Items to Shopping Cart");
        cart.add(new ShoppingCart.Item("Can of Soup", 4.00));
        cart.add(new ShoppingCart.Item("Bread", 2.50));
    }

    public static void displayBag(ShoppingCart cart) {
        System.out.println("Shopping Cart contents:");
        for (ShoppingCart.Item item : cart.toArray()) {
            System.out.println(item);
        }
    }
}
