import java .util.*;
public class btzigzogt {
    public List<List<Integer>> zigzag(TreeNode root) {
        if(root==null) {
            return null;
        }
        List<List<Integer>> ans=new ArrayList<>();
        Deque<TreeNode> q=new LinkedList<>();
        boolean reverse=false;
        q.offer(root);
        while(q!=null) {
            int ls=q.size();
                
                List<Integer> l=new ArrayList<>();
                for(int i=0;i<ls;i++) {
                    if(!reverse) {
                    TreeNode c=q.removeFirst();
                    l.add(c.val);

                
                if(c.left!=null) {
                    q.addLast(c.left);
                }
                if(c.right!=null) {
                    q.addLast(c.right);
                }
             }
            
            else {    
                TreeNode c=q.removeLast();
                l.add(c.val);
                if(c.right!=null) {
                    q.addFirst(c.right);
                }
                if(c.left!=null) {
                    q.addFirst(c.left);
                }

            }
        }
            reverse=!reverse;
            ans.add(l);
              
            }
            
        
        return ans;



    }
    
}
