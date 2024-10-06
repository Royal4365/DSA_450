package DSA_450.Searching_And_Sorting;

import java.util.Arrays;

public class target_3sum {
    public static void main(String[] args) {
        int []arr = {5, 1, 3, 4, 7};
        int target =12;
        int[][]result = sum(arr,target);
        if(result.length>0){
            System.out.println(Arrays.deepToString(result));
        }else{
            System.out.println("Not found");
        }

    }
    static int[][] sum(int[]arr,int target){
        int n= arr.length;
        Arrays.sort(arr);
        int [][]result = new int[0][0];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]<target){
                        result = Arrays.copyOf(result, result.length + 1);
                        result[result.length - 1] = new int[]{arr[i], arr[j], arr[k]};
                    }
                }
            }
        }
        return result;
    }
}
