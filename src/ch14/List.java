package ch14;

public interface List<E> {
    int size();
    boolean isEmpty();
    void clear ();
    E get(int index);
    void add(E element);
    void add(int index, E element);
    E remove(int index);
    int indexOf(Object o);

}
