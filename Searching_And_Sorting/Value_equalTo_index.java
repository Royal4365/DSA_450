package DSA_450.Searching_And_Sorting;

import java.util.Arrays;

public class Value_equalTo_index {
    public static void main(String[] args) {
        int[] arr = {15, 2, 45, 12, 7};
        int target = 2;
        int n = arr.length;
        valueEqualIndex(arr,n);
    }
    static void valueEqualIndex(int[]arr,int n){
        for(int i=0;i<n;i++){
            if(arr[i] == i+1){
                System.out.println(arr[i]+" ");
            }
        }
    }
}
