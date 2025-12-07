public class pathsum {
    public boolean hasPathSum(TreeNode root,int targetSum) {
        int target=targetSum;
        if(root==null) {
            return false;
        }
        if(root.val==target && root.left==null && root.right==null) {
            return true;

        }
        
       
        target=target-root.val;
        return hasPathSum(root.left,target) || hasPathSum(root.right,target);
        
    }
    
}
