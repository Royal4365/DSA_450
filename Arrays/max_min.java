package DSA_450.Arrays;

import java.util.Arrays;

public class max_min {
    public static void main(String[] args) {
        int[]arr = {1,3,9,5,2,8};
        min(arr);
        max(arr);
    }
    static void min(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum is "+ min);
    }
    static void max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum is "+ max);
    }
}
