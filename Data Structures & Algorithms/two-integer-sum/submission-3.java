class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> myMap = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            myMap.put(nums[i],i);
        }

        for(int i =0;i<nums.length;i++){
            int difference = 0;
            difference = target - nums[i];
            if(myMap.containsKey(difference) && myMap.get(difference) != i){
               int index = myMap.get(difference);
                return new int[]{i,index};
            }
        }

        return new int[]{0,0};

    }
}
