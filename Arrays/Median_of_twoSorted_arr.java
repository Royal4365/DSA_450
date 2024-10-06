package DSA_450.Arrays;

import java.util.Arrays;

public class Median_of_twoSorted_arr {
    static int ans(int[]arr){
        int n= arr.length;
        if(n%2==0){
            int c=n/2;
            int a = arr[c];
            int b = arr[c-1];

            int mid = (a+b)/2;
            return mid;
        }else{
            int z = Math.round(n/2);
            return arr[z];
        }
    }
    public static void main(String[] args) {
        int []arr1 = { -5, 3, 6, 12, 15, 65 };
        int[] arr2 = { -12, -10, -6, -3, 4, 10 };

        int i = arr1.length;
        int j = arr2.length;
        int[]arr3 = new int[i+j];

        System.arraycopy(arr1,0,arr3,0,i);
        System.arraycopy(arr2,0,arr3,i,j);
        Arrays.sort(arr3);
        System.out.println("Median = "+ ans(arr3));
    }
}
