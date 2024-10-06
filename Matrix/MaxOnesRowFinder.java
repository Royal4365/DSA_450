package DSA_450.Matrix;

import javax.imageio.ImageTranscoder;
import java.util.Arrays;

public class MaxOnesRowFinder {
    public static void main(String[] args) {
        int [][]arr = {{0, 1, 1, 1},
                        {0, 0, 1, 1},
                        {1, 1, 1, 1},
                         {0, 0, 0, 0}};
        int maxOnesRow = findMaximum(arr);
        System.out.println("Row with maximum ones: " + maxOnesRow);

    }
    static int findMaximum(int[][]arr){
        int n= arr.length;
        int count=0;
        int maxOnesRow = -1;
        int maxOnesCount = -1;

        for(int i=0;i<n;i++){
            int onesCount = 0;
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==1){
                    onesCount++;
                }
            }
            if(onesCount > maxOnesCount){
                maxOnesCount = onesCount;
                maxOnesRow = i;
            }
        }
        return maxOnesRow;
    }
}
