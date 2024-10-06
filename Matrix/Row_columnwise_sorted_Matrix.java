package DSA_450.Matrix;

import java.util.Arrays;

public class Row_columnwise_sorted_Matrix {
    static final int row = 4;
    static final int col = 4;
    public static void main(String[] args) {
        int [][]arr = {{10,20,30,40},
                       {15,25,35,40},
                       {27,29,37,48},
                       {32,33,39,50}};

        int[] arr1 = new int[arr[0].length];
        int[] arr2 = new int[arr[0].length];
        int[] arr3 = new int[arr[0].length];
        int[] arr4 = new int[arr[0].length];

        for(int i=0;i<arr[0].length;++i){
            arr1[i] = arr[0][i];
            arr2[i] = arr[1][i];
            arr3[i] = arr[2][i];
            arr4[i] = arr[3][i];
        }

        int n = arr1.length+arr2.length+arr3.length+arr4.length;
        int[]ans = new int[n];
        System.arraycopy(arr1,0,ans,0,arr1.length);
        System.arraycopy(arr2,0,ans,arr1.length, arr2.length);
        System.arraycopy(arr3,0,ans,arr1.length+arr2.length,arr3.length);
        System.arraycopy(arr4,0,ans,arr1.length+arr2.length+arr3.length,arr4.length);

        System.out.println("Original arr :");
        System.out.println(Arrays.toString(ans));
        Arrays.sort(ans);
        System.out.println(Arrays.toString(ans));


        int [][]mat = new int[4][4];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j] = ans[i*col+j];
            }
        }
        System.out.println(Arrays.deepToString(mat));
    }


}
