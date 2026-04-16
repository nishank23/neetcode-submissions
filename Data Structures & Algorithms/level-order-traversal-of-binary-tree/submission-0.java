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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> myMainList = new ArrayList<>();
        Deque<TreeNode> queue = new ArrayDeque<TreeNode>();

        if(root!=null){
            queue.add(root);
        }
        int level = 0;
        while(!queue.isEmpty()){
            System.out.print("level " + level + ": ");
            int levelLength = queue.size();
            List<Integer> myList = new ArrayList<>();
            for(int i =0;i<levelLength;i++){
                TreeNode curr = queue.removeFirst();
                System.out.print(curr.val + " ");
                myList.add(curr.val);
                if(curr.left!=null){
                    queue.add(curr.left);
                }
                if(curr.right!=null){
                    queue.add(curr.right);
                }  
            }
            level++;
            System.out.println(" ");

            myMainList.add(myList);


        }
        return myMainList;
    }
}
