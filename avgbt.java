import java.util.*;
public class avgbt {
    public List<Float> levelOrder(TreeNode root) {
    List<Float> ans=new ArrayList<>();
    Queue<TreeNode> q=new LinkedList<>();
    if(root==null) {
        return ans;
    }
    q.offer(root);
    while(!q.isEmpty()) {
        float avg=0;
        int ls=q.size();
        for(int i=0;i<ls;i++) {
            TreeNode Currentnode=q.poll();
            
            avg=avg+Currentnode.val;
        
        if(Currentnode.left!=null) {
            q.offer(Currentnode.left);
        }
        if(Currentnode.right!=null) {
            q.offer(Currentnode.right);
        }
    }
        ans.add(avg/ls);






    }
    return ans;



}
}
