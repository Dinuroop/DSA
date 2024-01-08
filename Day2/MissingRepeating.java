package Day2;

import java.util.Arrays;

public class MissingRepeating {
    public static void main(String[] args) {
        int array[] = {3,5,2,4,3};
        int n = array.length;
        int sum = n*(n+1)/2;
        int sq_sum = n*(n+1)*(2*n+1)/6;
        int arr_sum = 0;
        int sq_arr_sum = 0;
        for (int i = 0; i < array.length; i++) {
            arr_sum+=array[i];
            sq_arr_sum += array[i]*array[i];
        }
        System.out.println(arr_sum+" "+sum+" "+sq_arr_sum+" "+sq_sum);
        int val1 = arr_sum-sum;
        int val2 = sq_arr_sum-sq_sum;
        val2 = val2/val1;
        int x = (val1+val2)/2;
        int y = x-val1;
        int[] a = {x,y};
        System.out.println(Arrays.toString(a));
    }
}
