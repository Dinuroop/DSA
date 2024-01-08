package Day3;

public class UniquePaths{
    public static int paths(int i, int j, int m, int n){
        if(i==m-1 && j==n-1) return 1;
        if(i>m || j>n) return 0;
        else return paths(i+1,j, m, n)+paths(i, j+1, m, n);
    }
    public static void main(String[] args){
        int m = 2;
        int n = 2; 
        int x = paths(0, 0, m, n);
        System.out.println(x);
    }
}