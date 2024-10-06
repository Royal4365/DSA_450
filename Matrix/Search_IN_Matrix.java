package DSA_450.Matrix;

public class Search_IN_Matrix {
    public static void main(String[] args) {
        int[][]arr = {{1,2,3},{4,5,6},{7,8,9}};
        int n= arr.length;
        int target = 10;
        boolean ans = search(arr,target);
        if(ans==true){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
    static boolean search(int[][]arr,int target){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}
