package DSA_450.Matrix;

public class CommonElementInAllRows {
    public static void main(String[] args) {
        int[][]arr = {{1,2,7, 8},{3, 8, 5, 1},
                        {8, 7, 3, 1},{8, 1,7, 9}};
        System.out.println("Output:");
        common(arr);
    }
    static void common(int [][]arr){
        int r = arr.length;
        int c = arr[0].length;

        for(int i=0;i<r;i++){
            int curr = arr[0][i];
            boolean isCommon = true;

            for(int j=1;j<r;j++){
                boolean found = false;
                for(int k=0;k<c;k++){
                    if(arr[j][k] == curr){
                        found = true;
                        break;
                    }
                }
                if(!found){
                    isCommon = false;
                    break;
                }
            }
            if(isCommon){
                System.out.println(curr +" ");
            }
        }
    }


}
