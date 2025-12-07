import java.util.*;
public class losucc {
    TreeNode los(TreeNode r,TreeNode root) {
        if(root==null) {
            return null;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(q!=null) {
            int ls=q.size();
                TreeNode c=q.poll();
                
                if(c.left!=null) {
                    q.offer(c.left);
                }
                if(c.right!=null) {
                    q.offer(c.right);
                }
                if(c==r) {
                    return q.peek();
                }
            }
            
        
        return null;


    }
    
}
