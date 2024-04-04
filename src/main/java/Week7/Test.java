package Week7;

/**
 *
 * @author zahid
 */
public class Test {

    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree();
        tree.insert(15);
        tree.insert(6);
        tree.insert(18);
        tree.insert(3);
        tree.insert(7);
        tree.insert(30);
        tree.insert(2);
        tree.insert(4);
        tree.insert(13);
        tree.insert(9);
        //tree.inorder();
        //tree.delete(5);
        //System.out.println("");
        //tree.inorder();
        System.out.println(tree.size());
    }
}
