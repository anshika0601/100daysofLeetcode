import java.util.*;
public class cousinsbt {
    public TreeNode findNode(TreeNode root,int x) {
        if(root==null) {
            return null;
        }
        if(root.val==x) {
            return root;
        }
        TreeNode left=findNode(root.left,x);
        if(left!=null) {
            return left;
        }
        return findNode(root.right,x);
    }
    boolean isSib(TreeNode node,TreeNode x,TreeNode y) {
        if(node==null) {
            return false;
        }
        return node.left==x && node.right==y||node.left==y && node.right==x || isSib(node.left,x,y)||isSib(node.right,x,y) ;

    }
    public int level(TreeNode node,TreeNode x,int lev) {
        if(node==null) {
            return 0;
        }
        if(node==x) {
            return lev;
        }
        int l=level(node.left,x,lev+1);
        if(l!=0) {
            return l;
        }
        return level(node.right,x,lev+1);
    }

    public boolean isCousins(TreeNode root,int x,int y) {
        Queue<TreeNode> q=new LinkedList<>();
        TreeNode xx=findNode(root,x);
        TreeNode yy=findNode(root,y);
       return (
        (level(root,xx,0)==level(root,yy,0))&& (!isSib(root,xx,yy))
       )

    }
    
}
