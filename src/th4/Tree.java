package th4;

public interface Tree<E> {
    boolean insert(E e);
    void inorder();
    int getSize();

}
