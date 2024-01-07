public class Pascals {
    public static int factorial(int x){
        if (x==0 )return 1;
        else return x * factorial(x -1);
    }
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j=0 ;j<=i; j++ ){
                System.out.print(factorial(i)/(factorial(i-j)*factorial(j))+" ");
        }
        System.out.println();
    }
}

}
