import java.util.*;
public class sanddsbt {
    public List<String> serialize(TreeNode node) {
        List<String> list=new ArrayList<>();
        helper(node,list);
        return list;

    }
    void helper(TreeNode node,List<String> list) {
        if(node==null) {
            list.add("null");
            return;
        }
        list.add(String.valueOf(node.val));
        helper(node.left,list);
        helper(node.right,list);


    }
    TreeNode deserialize(List<String> list) {
        Collections.reverse(list);
        TreeNode node=helper2(list);
        return node;
    }
    TreeNode helper2(List<String> list) {
        String val=list.remove(list.size()-1);
        if(val.charAt(0)=='n') {
            return null;
        }
        TreeNode n=new TreeNode(Integer.parseInt(val));
        n.left=helper2(list);
        n.right=helper2(list);

        return n;

    }

    
}
