public class BinaryTree {
    private int	data;
    private BinaryTree leftChild;
    private BinaryTree rightChild;

    public BinaryTree(int d) {
        data = d;
        leftChild = null;
        rightChild = null;
    }

    public BinaryTree(int d, BinaryTree left, BinaryTree right) {
        data = d;
        leftChild = left;
        rightChild = right;
    }

    // Get methods
    public int getData() { return data; }
    public BinaryTree getLeftChild() { return leftChild; }
    public BinaryTree getRightChild() { return rightChild; }

    // Set methods
    public void setData(int d) { data = d; }
    public void setLeftChild(BinaryTree left) { leftChild = left; }
    public void setRightChild(BinaryTree right) { rightChild = right; }

    /**
     * Returns true if the calling BinaryTree is the same as the argument BinaryTree.
     * Two binary trees should be considered the same if they have the same node
     * structure (i.e. exact same shape) and each matching node has the same value.
     * In other words, the data stored in the two trees is identical.
     **/
    public boolean sameAs(BinaryTree otherRoot){
        return false;
    }

}
