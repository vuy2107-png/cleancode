import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPAPACITY = 10;
    private Object elemenets[];

    public MyList() {
        elemenets = new Object[DEFAULT_CAPAPACITY];
    }

    private void ensureCapa() {
        int newSize = elemenets.length * 2;
        elemenets = Arrays.copyOf(elemenets, newSize);
    }

    public void add(E e) {
        if (size == elemenets.length) {
            ensureCapa();
        }
        elemenets[size++] = e;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index:" + i + ", Size " + i);
        }
        return (E) elemenets[i];
    }
}
