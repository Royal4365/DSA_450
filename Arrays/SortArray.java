package DSA_450.Arrays;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[]arr = {0,1,2,0,1,2,0,1,0,1,1,2,2,0,1,2,0};
        sort(arr);
        System.out.println("Sorted array :" + Arrays.toString(arr));
    }
    static void sort(int []arr) {
        int low=0;
        int mid = 0;
        int high = arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            } else if(arr[mid]==1) {
                mid++;
            }else{
                swap(arr,mid,high);
                high--;
            }
        }
    }
    static void swap(int[]arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
