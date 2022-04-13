public class waterContainer{
    /*You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.*/
    public static int mostWaterContainer(int[] height){
        int l = 0, r = height.length-1, max = Integer.MIN_VALUE;
        while(l<r){
            if(height[l] < height[r]){
                max = Math.max(max,height[l]*(r-l));
                l++;
            }
            else{
                max = Math.max(max,height[r]*(r-l));
                r--;
            }
        }
        return max;
    }
}