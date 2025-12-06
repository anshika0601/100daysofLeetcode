import java.util.*;
public class bst {
    public class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;

    public Node(int value) {
        this.value=value; }
    public int getValue() {
        return value;
        }

    } 
    private Node root;
    public bst() {

    }
    public int height(Node node) {
        if(node==null) return -1;
        return node.height;
    }
    public boolean isEmpty() {
        return root==null;
    }
    public void insert(int value) {
        root=insert(value,root);

    }
    public Node insert(int value, Node node) {
        if(node==null) {
            node=new Node(value);
            return node;
        }
        if(value<node.value) {
            node.left=insert(value,node.left);
        }
        else {
            node.right=insert(value,node.right);
        }
        node.height=Math.max(height(node.left),height(node.right))+1;
        return node;


    }


    public void display() {
        display(this.root,"Root Node:");
    }
    private void display(Node node,String indent) {
        if(node==null) return;
        System.out.println(indent+node.value);
        display(node.left,"left child of"+node.value+" is:");
        display(node.right,"right child of"+node.value+" is:");
        

    }
    public void populate(int nums[]) {
        for(int i=0;i<nums.length;i++) {
            this.insert(nums[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        bst tree=new bst();
        int[] nums={5,2,3,7,8,6};
        tree.populate(nums);
        tree.display();

    }
    
}
