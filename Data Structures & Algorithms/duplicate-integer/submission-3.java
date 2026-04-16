class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length==0){
            return false;
        }
        Arrays.sort(nums);
        int inital = nums[0];
        for(int i =1;i<nums.length;i++){
            if(inital==nums[i]){
                return true;
            }else{
                inital = nums[i];
            }
        }
        return false;
    }
}
