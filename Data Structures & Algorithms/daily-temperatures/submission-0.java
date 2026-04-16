class Solution {
    public int[] dailyTemperatures(int[] temp) {
         int[] res = new int[temp.length];
        for(int i =0;i<temp.length;i++){
            for(int j =i;j<temp.length;j++){
                if(i==j) continue;
                if(temp[j]>temp[i]){
                    res[i] = j-i;
                    break;
                }else{
                    res[i] = 0;
                }
            }
        }
        return res;

    }
}
