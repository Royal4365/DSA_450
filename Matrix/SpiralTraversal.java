package DSA_450.Matrix;

public class SpiralTraversal {
    public static void main(String[] args) {
        int [][]arr={{1, 2, 3, 4},
                     {12, 13, 14, 5},
                     {11, 16, 15, 6},
                     {10, 9, 8, 7}};
        spiral(arr);

    }
    static void spiral(int[][]arr){
        int top =0;
        int bottom = arr.length-1;
        int left = 0;
        int right = arr[0].length-1;

        while (top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                System.out.print(arr[top][i]+" ");
            }
            top++;

            for(int i=top;i<=bottom;i++){
                System.out.print(arr[i][right]+" ");
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    System.out.print(arr[bottom][i]+" ");
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }
    }
    static void printArray(int[][]arr){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
