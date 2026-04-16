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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> myMainList = new ArrayList<>();
        Deque<TreeNode> queue = new ArrayDeque<TreeNode>();
        if(root!=null){
            queue.add(root);
        }
        int level = 0;
        while(!queue.isEmpty()){
            int levelLength = queue.size();
            System.out.print("level "+level);
            for(int i =0;i<levelLength;i++){
                TreeNode curr = queue.removeFirst();
                if (i == levelLength - 1) {
                    // ...add its value to our result list.
                    myMainList.add(curr.val);
                }
                System.out.print("      "+curr.val);
                if(curr.left!=null){
                    queue.add(curr.left);
                }
                if(curr.right!=null){
                    queue.add(curr.right);
                }
            }
            level++;
            System.out.println(" ");
            

        }
        return myMainList;




    }
}
