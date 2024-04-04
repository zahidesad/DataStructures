package Week7;

/**
 *
 * @author zahid
 */
public class BinarySearchTree<T extends Comparable<T>> {

    Node<T> root;

    void insert(T newData) {
        Node<T> newNode = new Node<>(newData);
        if (root == null) {
            root = newNode;
        } else {
            Node<T> temp = root;
            while (temp != null) {
                if (newData.compareTo(temp.data) < 0) {
                    if (temp.left == null) {
                        temp.left = newNode;
                    }
                    temp = temp.left;
                } else if (newData.compareTo(temp.data) > 0) {
                    if (temp.right == null) {
                        temp.right = newNode;
                    }
                    temp = temp.right;
                } else {
                    return;
                }
            }
        }
    }

    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    void preorder() {
        preorderRec(root);
    }

    void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    void postorder() {
        postorderRec(root);
    }

    void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.data + " ");
        }
    }

    void delete(T key) {
        Node<T> parent = null;
        Node<T> current = root;

        //Find deleted node
        while (current != null & !current.data.equals(key)) {
            parent = current;
            if (key.compareTo(current.data) < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        if (current == null) {
            return;
        }

        //Case 1 : has no child 
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else {
                if (current == parent.left) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            }
        } // Case 2 : Has one child
        else if (current.left == null || current.right == null) {
            Node<T> child;
            if (current.left != null) {
                child = current.left;
            } else {
                child = current.right;
            }

            if (current == root) {
                root = child;
            } else {
                if (current == parent.left) {
                    parent.left = child;
                } else {
                    parent.right = child;
                }
            }
        } // Case 3 : Has two child 
        else {
            Node<T> successor = current.right;
            Node<T> successorParent = current;

            while (successor.left != null) {
                successorParent = successor;
                successor = successor.left;
            }
            current.data = successor.data;

            if (successor.equals(successorParent.left)) {
                successorParent.left = successor.right;
            } else {
                successorParent.right = successor.right;
            }

        }

    }
    
    public int findSmallest(Node<Integer> node) {
        Node<Integer> current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }
    public int size() {
        return sizeRecursive(root);
    }

    private int sizeRecursive(Node<T> node) {
        if (node == null) {
            return 0;
        }
        return 1 + sizeRecursive(node.left) + sizeRecursive(node.right);
    }
}
