// Definition for a pair
// class Pair {
//     int key;
//     String value;
//
//     Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {
        
        List<List<Pair>> myList = new ArrayList<>();
        
        for(int i = 0;i<pairs.size();i++){
            int j =i-1;
            int current = pairs.get(i).key;
            String currentValue = pairs.get(i).value;

            while(j>=0&&pairs.get(j).key>current){
                pairs.get(j+1).key = pairs.get(j).key;
                pairs.get(j+1).value = pairs.get(j).value;

                j--;
            }
            pairs.get(j+1).key = current;
            pairs.get(j+1).value = currentValue;

            List<Pair> snapshot = new ArrayList<>();
            for (Pair p : pairs) {
                snapshot.add(new Pair(p.key, p.value));
            }
            myList.add(snapshot);
        }


        
        return myList;
    }
}
