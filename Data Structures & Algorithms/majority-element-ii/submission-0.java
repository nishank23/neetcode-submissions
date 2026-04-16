class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> myHashMap = new HashMap<>();
        List<Integer> myIntList = new ArrayList<>();
        int n = nums.length;
        for(int num : nums){
            myHashMap.put(num,myHashMap.getOrDefault(num,0)+1);
        }
        for(int key:myHashMap.keySet()){
           int val= myHashMap.get(key);
           if(val>n/3){
                myIntList.add(key);
           }
        }

        return myIntList;



    }
}