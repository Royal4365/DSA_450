package DSA_450.Arrays;

import java.util.Arrays;

public class Median {
    public static void main(String[] args) {
        int []arr = {90,100,78,89,67};
        Arrays.sort(arr);
        System.out.println("Median = "+ find_median(arr));
    }
    static int find_median(int[]arr){
        int n = arr.length;
        if(n%2==0){
            int mid = (n/2 + (n/2+1))/2;
            return  arr[mid];
        }else{
            return arr[n/2];
        }
    }
}
