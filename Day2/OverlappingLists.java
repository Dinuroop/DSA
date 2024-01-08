package Day2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class OverlappingLists {
    public static List<List<Integer>> merge(int[][] arr) {
        int n = arr.length;

        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[]a,int[]b){
                return a[0]-b[0];
            }
        });

        for (int[] is : arr) {
            System.out.print(Arrays.toString(is));
        }
        System.out.println();
        
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if(res.isEmpty()||arr[i][0]>res.get(res.size()-1).get(1)){
                res.add(Arrays.asList(arr[i][0],arr[i][1]));
            }
            else{
                res.get(res.size()-1).set(1,Math.max(res.get(res.size()-1).get(1), arr[i][1]));
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8,10},{15,18}};
        List<List<Integer>> ans = merge(intervals);
        for (List<Integer> list : ans) {
            System.out.print(list);
        }
    }
}
