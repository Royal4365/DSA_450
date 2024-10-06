package DSA_450.Matrix;

public class Specific_Pair {
    public static void main(String[] args) {
        int[][] mat = {{ 1, 2, -1, -4, -20},
                         { -8, -3, 4, 2, 1},
                         { 3, 8, 6, 1, 3},
                         { -4, -1, 1, 7, -6},
                         { 0, -4, 10, -5, 1}};
        int n = 5;
        System.out.println("Maximum value is "+ find_max(mat,n));
    }
    static int find_max(int[][]mat,int n){
        int maxValue = Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                for(int k=i+1;k<n;k++){
                    for(int l=j+1;l<n;l++){
                        if(maxValue <(mat[k][l] - mat[i][j])){
                            maxValue = mat[k][l] - mat[i][j];
                        }
                    }
                }
            }
        }
        return maxValue;
    }
}
