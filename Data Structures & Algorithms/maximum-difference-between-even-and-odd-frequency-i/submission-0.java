class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> sHashMap = new HashMap<>();

        for(int i =0;i<s.length();i++){
            sHashMap.put(s.charAt(i),sHashMap.getOrDefault(s.charAt(i),0)+1);
        }
        int evenMin=Integer.MAX_VALUE;
        int oddMax=0;


        for(int values:sHashMap.values()){
            int curreven =0;
            int currodd = 0;

            if(values%2==0){

                evenMin = Math.min(evenMin,values);
            }else{
                oddMax = Math.max(oddMax,values);
            }

        }

        return oddMax-evenMin;



    }
}