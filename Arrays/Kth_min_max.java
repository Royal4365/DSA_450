package DSA_450.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Kth_min_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n= sc.nextInt();
//        int []arr = {1,4,3,6,2,12,8};
        int []arr = new int[n];
        System.out.println("Enter "+ n +" elements of array :");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Enter k :");
        int k = sc.nextInt();
        System.out.println("Kth max is :" + kth_max(arr, k));
        System.out.println("Kth min is :" + kth_min(arr,k));
    }
    static int kth_max(int[]arr,int k) {
        Arrays.sort(arr);
        return arr[arr.length-k];
    }
    static int kth_min(int[]arr,int k) {
        Arrays.sort(arr);
        return arr[k-1];
    }
}
