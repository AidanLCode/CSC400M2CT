public interface BagInterface<T> {
    public boolean add(T newItem);
    public T[] toArray();
    public boolean isFull();
    public int getNumberOfProducts();
}
