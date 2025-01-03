/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> pre(TreeNode root,List<Integer> arr)
    {
        if(root!=null)
        {
            arr.add(root.val);
            pre(root.left,arr);
            pre(root.right,arr);
        }
        return arr;
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        arr=pre(root,arr);
        return arr;
    }
}