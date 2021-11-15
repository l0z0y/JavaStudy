package genericInterface;

public interface Data<E> {
    void add(E element);
    void delete(int id );
    void update (E element);
    E query(int id );


}
