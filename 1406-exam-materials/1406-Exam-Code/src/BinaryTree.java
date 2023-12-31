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
        // The default value is false and represents the case if only ONE child is null
        boolean leftChildSame =  false;
        boolean rightChildSame = false;

        // If both are null
        if (leftChild == null && otherRoot.getLeftChild() == null) {
            leftChildSame = true;

        // If neither are null
        } else if (!(leftChild == null || otherRoot.getLeftChild() == null)) {
            leftChildSame = leftChild.sameAs(otherRoot.getLeftChild());
        }

        // If both are null
        if (rightChild == null && otherRoot.getRightChild() == null) {
            rightChildSame = true;

            // If neither are null
        } else if (!(rightChild == null || otherRoot.getRightChild() == null)) {
            rightChildSame = rightChild.sameAs(otherRoot.getRightChild());
        }

        return (data == otherRoot.getData()) && leftChildSame && rightChildSame;
    }
}
