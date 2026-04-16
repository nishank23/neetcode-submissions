class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int i = 1;
        int maxCount =0;
        int n = nums.length;
        int count =0;
        Arrays.sort(nums);
        while(i<n){
            int sub =nums[i]-nums[i-1];
            if(sub==1){
                count++;
            }
            if(maxCount<count){
                maxCount = count;
            }
            if(sub>1){
                count = 0;
            }
            i++;


        }
        return ++maxCount;
    }
}
