package Day19;

public interface Queue <E> {
    void add(E item);
    E remove();
    int size();
}
