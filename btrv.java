import java.util.*;
public class btrv {
    public List<Integer> rightsideview(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null) {
            return ans;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()) {
            int ls=q.size();
            for(int i=0;i<ls;i++) {
                TreeNode cur=q.poll();
                if(i==ls-1) {
                    ans.add(cur.val);
                }
                if(cur.left!=null) {
                    q.offer(cur.left);
                }
                if(cur.right!=null) {
                    q.offer(cur.right);
                }

            }
            

        }
        return ans;

    }
    
}
