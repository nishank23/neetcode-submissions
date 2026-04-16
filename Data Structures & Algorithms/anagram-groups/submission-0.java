class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character,Integer>,List<String>> myMap = new HashMap<>();

        for(String str :strs){
            HashMap<Character,Integer> freqMap = new HashMap<>();
            for(char c : str.toCharArray()){
                freqMap.put(c,freqMap.getOrDefault(c,0)+1);
            }
            if(!myMap.containsKey(freqMap)){
                myMap.put(freqMap,new ArrayList<>());
            }
            myMap.get(freqMap).add(str);
        }
         return new ArrayList<>(myMap.values());
    }
}
