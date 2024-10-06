package DSA_450.Matrix;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Kth_smallest {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int [][]arr =  {{10, 20, 30, 40},
                        {15, 25, 35, 45},
                        {24, 29, 37, 48},
                        {32, 33, 39, 50}};

        int []arr1 = new int[arr[0].length];
        int []arr2 = new int[arr[0].length];
        int []arr3 = new int[arr[0].length];
        int []arr4 = new int[arr[0].length];

        for(int i =0;i<arr[0].length;++i){
            arr1[i] = arr[0][i];
            arr2[i] = arr[1][i];
            arr3[i] = arr[2][i];
            arr4[i] = arr[3][i];
        }

        int n = arr1.length+arr2.length+arr3.length+arr4.length;
        int []num = new int[n];
        System.arraycopy(arr1,0,num,0,arr1.length);
        System.arraycopy(arr2,0,num,arr1.length,arr2.length);
        System.arraycopy(arr3,0,num,arr1.length+arr2.length,arr3.length);
        System.arraycopy(arr4,0,num,arr1.length+arr2.length+arr3.length,arr4.length);

        System.out.println("Original array :- ");
        System.out.println(Arrays.toString(num));
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        System.out.print("enter the value of k :- ");
        int k = scan.nextInt();
        System.out.print("the kth smallest element in the array is :- ");
        System.out.println(num[k-1]);
    }
}