package th4;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;

    public BST(){

    }

    public BST(E[] object){
        for (int i = 0; i < object.length; i++) {
            insert(object[i]);
        }
        @Override
        public boolean insert(E e){
            if (root=null)
                root = createNewNode(e);
            else{
                TreeNode<E> parent = null;
                TreeNode<E> current = root;
            }
        }
    }

}
