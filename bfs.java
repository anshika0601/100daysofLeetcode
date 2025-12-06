import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

     public class TreeNode {
    int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
    TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
                  this.left = left;
         this.right = right;
     }
 
/*public class bfs {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> ne=new ArrayList<>();
        if(root==null) {
            return ne;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()) {
            int levelSize=q.size();
            List<Integer> n=new ArrayList<>();
            for(int i=0;i<levelSize;i++) {
                TreeNode currentNode=q.poll();
                n.add(currentNode.val);
                if(currentNode.left!=null) {
                    q.offer(currentNode.left);
                }
                if(currentNode.right!=null) {
                    q.offer(currentNode.right);
                }
            }
            ne.add(n);

        }
        return ne;
    }
}
*/
public class bfs {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) {
            return ans; 
        }
        q.offer(root);
        while(!q.isEmpty()) {
            int ls=q.size();
            List<Integer> l=new ArrayList<>();
            for(int i=0;i<ls;i++) {
                TreeNode curnode=q.poll();
                l.add(curnode.val);
                if(curnode.left!=null) {
                    q.offer(curnode.left);
                }
                if(curnode.right!=null) {
                    q.offer(curnode.right);
                }
                ans.add(l);


            }

        }
        return ans;
    }
}
            


            
        
        
    
}
