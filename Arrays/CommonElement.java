package DSA_450.Arrays;

import java.util.Arrays;

public class CommonElement {
    public static void main(String[] args) {
        int[]a = {1, 4, 10, 20, 40, 80};
        int[]b = {6, 4, 20, 80, 100};
        int[]c = {3, 4, 15, 20, 30, 70, 80, 120};
        int[]ans = common(a,b,c);

        System.out.println(Arrays.toString(ans));

    }
    static int[] common(int[]a,int[]b,int[]c){
        int n1 = a.length,n2 = b.length,n3 = c.length;
        int count =0;
        int maxLength = Math.min(Math.min(a.length, b.length), c.length);
        int []commonElem = new int[maxLength];

        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                for(int k=0;k<n3;k++){
                    if(a[i]==b[j] && a[i]==c[k]){
                        commonElem[count++] = a[i];
                        break;
                    }
                }
            }
        }
        return Arrays.copyOf(commonElem,count);
    }
}
