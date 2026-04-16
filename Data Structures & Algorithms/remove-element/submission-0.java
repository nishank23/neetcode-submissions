class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        ArrayList<Integer> myList = new ArrayList<>();
        for(int n :nums){
            if(val!=n){
                myList.add(n);
            }
        }
        for (int i = 0; i < myList.size(); i++) {
            nums[i] = myList.get(i);
        }
        
        
        return myList.size();
    }
}