class Solution {
    public boolean hasDuplicate(int[] nums) {



        //its used 2 pivot point bubble sort method //
        //so thus complexity is nlogn 
        Arrays.sort(nums);
        
        for(int i =1;i<nums.length;i++){ // n 
         if(nums[i]==nums[i-1]){
             return true;
         }
        }
        return false;

        //total will be nlogn approx 
    }
}
