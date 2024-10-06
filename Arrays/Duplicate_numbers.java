package DSA_450.Arrays;

public class Duplicate_numbers {
    public static void main(String[] args) {
        int[]arr = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
    static int findDuplicate(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
