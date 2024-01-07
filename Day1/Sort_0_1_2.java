import java.util.Arrays;

public class Sort_0_1_2 {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        int count_0 = 0;
        int count_1 = 0;
        int count_2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0) count_0++;
            else if(nums[i]==1) count_1++;
            else count_2++;
        }
        for (int i = 0; i < nums.length; i++) {
            if(count_0!=0) {nums[i]=0; count_0--;}
            else if(count_1!=0) {nums[i]=1; count_1--;}
            else {nums[i] = 2; count_2--;};
        }
        System.out.println("array:" +Arrays.toString(nums));
    }
}
