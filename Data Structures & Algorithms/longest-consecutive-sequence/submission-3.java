class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
    

        Set<Integer> hashSet = new HashSet<>();
        for(int num:nums){
            hashSet.add(num);
        }

        int max =0;
        for(int num:nums){
            if(!hashSet.contains(num-1)){
                int length =1;
                while(hashSet.contains(num+length)){
                    length++;
                }
                max = Math.max(max,length);
            }
        }    

        return max;

        
    }
}
