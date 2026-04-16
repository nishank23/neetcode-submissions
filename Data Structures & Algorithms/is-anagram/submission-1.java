class Solution {
    private char[] StringConvertor(String p1){
        char[] tmpArr = p1.toCharArray();
        Arrays.sort(tmpArr);
        return tmpArr;
    }
    public boolean isAnagram(String s, String t) {
        char [] schar = StringConvertor(s);
        char [] tchar = StringConvertor(t);

     return Arrays.equals(schar,tchar);  
    }
}
