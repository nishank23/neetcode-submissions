class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums;
        }
        int mid = n / 2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            leftArr[i] = nums[i];
        }
        for (int i = mid; i < n; i++) {
            rightArr[i - mid] = nums[i];
        }
        sortArray(leftArr);
        sortArray(rightArr);

        mergeArr(nums,leftArr,rightArr);

        return nums;



    }

    public void mergeArr(int[] ogArr, int[] leftArr, int[] rightArr) {
        int i = 0, j = 0, k = 0;
         while(i< leftArr.length && j< rightArr.length){
            if(leftArr[i] <= rightArr[j]){
                ogArr[k] = leftArr[i];
                i++;
            }else{
                ogArr[k] = rightArr[j];
                j++;
            }
            k++;
        }
         while(i< leftArr.length){
            ogArr[k] = leftArr[i];
            i++;
            k++;
        }
        while(j< rightArr.length){
            ogArr[k] = rightArr[j];
            j++;
            k++;
        }
    
    }

}