class Solution {
    public int countSeniors(String[] details) {
        int count =0;
        for(String st:details){
            if(getAge(st)>60){
                count++;
            }
        }
        return count;
    }
    public int getAge(String detail){
        char[] ch = detail.toCharArray();
        String sb= String.valueOf(ch[11])+String.valueOf(ch[12]);
        return Integer.parseInt(sb);

    }
}