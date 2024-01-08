package Day2;

public class DuplicateElement {
    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 2, 2};
        int n = arr.length;
        int sum = (n-1)*(n)/2;
        int arr_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr_sum+=arr[i];
        }
        int dup = arr_sum-sum;
        System.out.println("Duplicate Element: "+dup);
    }
}
