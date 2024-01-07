public class KandanesAlgorithm {
    public static int maxSum(int[] arr){
        int n = arr.length;
        int max_so_far = arr[0];
        int sum = 0;
        int ind = 0;
        int ind2 = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if(max_so_far<sum){
                max_so_far = sum;
                ind2 = i;
            }
            if(sum<0){
                sum = 0;
                ind = i+1;
            }
        }
        System.out.println(ind+" "+ind2);
        return max_so_far;
    }
    public static void main(String[] args) {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSum(array));
    }
}
