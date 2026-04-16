// Definition for a pair.
// class Pair {
//     int key;
//     String value;
//
//     public Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
class Solution {
    public List<Pair> quickSort(List<Pair> pairs) {
        return sort(pairs,0,pairs.size()-1);
    }
    public List<Pair> sort(List<Pair> myList, int start, int end){
        if(end-start+1<=1){
            return myList;
        }
        int pivot = myList.get(end).key;
        String pivotValue = myList.get(end).value;
        int left = start;


        for(int i =start;i<end;i++){
            if(myList.get(i).key < pivot){
                Pair temp = myList.get(left);
                myList.set(left,myList.get(i));
                myList.set(i,temp);
                left++;
            }
        }
        myList.set(end,myList.get(left));

        myList.set(left,new Pair(pivot,pivotValue));



        sort(myList,start,left-1);
        sort(myList,left+1,end);

        return myList;
    }


}
