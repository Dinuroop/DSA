package Day2;
import java.util.Arrays;

public class MergeTwoSortedArrays{
    public static void sort(int[] arr1, int[] arr2){
        int m = arr1.length;
        int n = arr2.length;
        int left = m-1; int right = 0;
        while (left >0 && right < n) {
            if(arr1[left]>arr2[right]){
                int temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right]=temp;
                left--;
                right++;
            }else if(arr1[left]<=arr2[right]){
                break;
            }
        }
    } 
    public static void main(String[] args){
        int arr1[] = {1,3,5,7};
        int arr2[] = {2,4,6};
        sort(arr1, arr2);
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println("The merged and sorted array is: "+Arrays.toString(arr1)+Arrays.toString(arr2));
    }
}