class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> arrayMap = new HashMap<>();
        for(int num:nums){
            arrayMap.put(num,arrayMap.getOrDefault(num,0)+1);
        }
        List<Integer> keyList = new ArrayList<>(arrayMap.keySet());

        keyList.sort((a,b) -> arrayMap.get(b) - arrayMap.get(a));
       
        int[] res = new int[k];
        for(int i =0 ;i<k;i++){
            res[i]=keyList.get(i);
        }
        return res;

    }
}
