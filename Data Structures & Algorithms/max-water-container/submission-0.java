class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;

        for(int i =0;i<heights.length;i++){
            int area = 0;
            for(int j = heights.length-1;j>i;j--){
                area = (j-i) * (Math.min(heights[i],heights[j]));
                if(maxArea<area){
                    maxArea = area;
                }
            }
            
        }

        return maxArea;

    }
}
