class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String sh :strs){
            sb.append(sh.length()).append("#").append(sh);
        }
        return sb.toString();

    }

    public List<String> decode(String str) {
       List<String> res = new ArrayList<>();
        int i =0;
        while(i<str.length()){

            int j = i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            String sh = str.substring(j+1,j+1+length);

            res.add(sh);

            i= j+1+length;


        }

        return res;
    }
}
