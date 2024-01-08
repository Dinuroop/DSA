package Day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement2{
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 3 , 3};
        int n = arr.length;
        int mini = (int)(n / 3) + 1;
        List<Integer> ls = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i: arr){
            int value  = map.getOrDefault(i,0);
            map.put(i,value+1);
            if (map.get(i) == mini) {
                ls.add(i);
            }
            if (ls.size() == 2) break;
        }
        System.out.println(ls);
    }
}