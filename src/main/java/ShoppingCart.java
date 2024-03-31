public class ShoppingCart implements BagInterface<ShoppingCart.Item> {
    private Item[] myBag; //Array to store items.
    private int numberOfProducts; //Tracks the total number of items added.
    private static final int DEFAULT_CAPACITY = 20; //Sets the default capacity of the bag.


    //ShoppingCart constructor.
    public ShoppingCart() {
        this.myBag = new Item[DEFAULT_CAPACITY];
        this.numberOfProducts = 0;
    }


    //adds a new item to the cart.
    @Override
    public boolean add(Item newItem) {
        if (isFull()) {
            return false;
        }
        myBag[numberOfProducts] = newItem;
        numberOfProducts++;
        return true;

    }

    //Returns an array copy of the bags contents.
    @Override
    public Item[] toArray() {
        return java.util.Arrays.copyOf(myBag, numberOfProducts);
    }

    //Checks to see if the bag is full.
    @Override
    public boolean isFull() {
        return numberOfProducts >= myBag.length;
    }

    //Gets the number of items in the bag.
    @Override
    public int getNumberOfProducts() {
        return this.numberOfProducts;
    }

    //Item static inner class.
    public static class Item {
        String itemName;
        double price;


        //Item Constructor.
        public Item(String itemName, double price) {
            this.itemName = itemName;
            this.price = price;
        }

        //toString method to display item details.
        @Override
        public String toString() {
            return itemName + ": $" + String.format("%.2f", price);
        }
    }
}
