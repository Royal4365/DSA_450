package DSA_450.Arrays;

import java.util.Arrays;

public class CountInversion {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        int[][]result = inversion(arr);
        if(result.length>0){
            System.out.println(Arrays.deepToString(result));
        }else{
            System.out.println("Not found any inversion");
        }
    }
    static int[][] inversion(int[]arr){
        int[][] result= new int[0][0];
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]>arr[j] && i<j){
//                    return new int[]{arr[i], arr[j]};
                    result = Arrays.copyOf(result,result.length+1);
                    result[result.length-1] = new int[]{arr[i], arr[j]};
                }
            }
        }
        return result;
    }
}
