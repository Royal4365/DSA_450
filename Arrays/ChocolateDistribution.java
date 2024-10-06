package DSA_450.Arrays;

import java.util.Arrays;

public class ChocolateDistribution {
    public static void main(String[] args) {
        int[]arr = {3,4,1,9,56,7,9,12};
        int n= arr.length;
        int m=5;
        System.out.println(minDifference(arr,n,m));
    }
    static int minDifference(int[]arr,int n,int m){
        if(n<m){
            return -1;
        }
        Arrays.sort(arr);

        int min=Integer.MAX_VALUE;
        for(int i=0;i+m-1<n;i++){
            int curr = arr[i+m-1]-arr[i];
            min = Math.min(min,curr);
        }
        return min;
    }
}
