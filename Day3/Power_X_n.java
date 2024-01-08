package Day3;

public class Power_X_n {
    public static void main(String[] args) {
        double x = 2.00000, n = -1;
        double res = 1.00000;
        if(n>=0){
            for (int i = 0; i < n; i++) {
                res *= x;
            }
        }else{
            for (int i = 0; i < n; i++) {
                res *= (double)(1.0)/x;
            }
        }
        System.out.println(res);
    }
}
