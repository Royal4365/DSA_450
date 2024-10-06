package DSA_450.Searching_And_Sorting;

import java.util.Arrays;

public class target_4sum {
    public static void main(String[] args) {
        int []arr = {10,2,3,4,5,7,8};
        int target = 23;
        int[][]result = sum(arr,target);
        if(result.length>0){
            System.out.println(Arrays.deepToString(result));
        }else{
            System.out.println("Not found");
        }
    }
    static int[][]sum(int[]arr,int target){
        int n= arr.length;
        int[][] result= new int[0][0];
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    for(int l=k+1;l<n;l++){
                        if(arr[i]+arr[j]+arr[k]+arr[l]==target){
                            result = Arrays.copyOf(result,result.length+1);
                            result[result.length-1] = new int[]{arr[i], arr[j],arr[k],arr[l]};
                        }
                    }
                }
            }
        }
        return result;
    }
}
