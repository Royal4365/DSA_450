package DSA_450.Searching_And_Sorting;

import java.util.Arrays;

public class FirstLastOcuurance {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,5,5,9,10};
        int target = 5;
        int []ans = firstLast(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] firstLast(int[]arr,int target){
        Arrays.sort(arr);
        int[]result = {-1,-1};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                if(result[0]==-1){
                    result[0] = i;  //first
                }
                result[1] = i;   //last
            }
        }
        return result;
    }
}
