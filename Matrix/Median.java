package DSA_450.Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Median {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int[][] arr = {{1,2,3},{6,8,5},{4,7,9}};

        int []arr1 = new int[arr[0].length];
        int []arr2 = new int[arr[0].length];
        int []arr3 = new int[arr[0].length];

        for(int i =0;i<arr[0].length;++i){
            arr1[i] = arr[0][i];
            arr2[i] = arr[1][i];
            arr3[i] = arr[2][i];
        }

        int n = arr1.length+arr2.length+arr3.length;
        int []ans = new int[n];
        System.arraycopy(arr1,0,ans,0,arr1.length);
        System.arraycopy(arr2,0,ans,arr1.length,arr2.length);
        System.arraycopy(arr3,0,ans,arr1.length+arr2.length,arr3.length);

        System.out.println("Original array :- ");
        System.out.println(Arrays.toString(ans));
        Arrays.sort(ans);
        System.out.println(Arrays.toString(ans));
        if(n%2==0){
            int mid = (n/2 + (n/2+1))/2;
            System.out.println(ans[mid]);
        }else{
            System.out.println(ans[n/2]);
        }
    }
}
