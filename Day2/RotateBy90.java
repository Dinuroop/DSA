package Day2;

import java.util.Arrays;

public class RotateBy90 {
    public static void rotate(int[][] mat){
        int n = mat.length;
        int m = mat[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < m; j++) {
                int temp = 0;
                temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m/2; j++){
                int temp = 0;
                temp = mat[i][j];
                mat[i][j] = mat[i][m-1-j];
                mat[i][m-1-j] = temp;
            }
        }

    }
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(mat);
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        // System.out.println("Matrix after rotation: "+Arrays.toString(mat));
    }
}
