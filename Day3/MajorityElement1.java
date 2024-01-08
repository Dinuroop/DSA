package Day3;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement1{
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 3};
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i: arr){
            int value  = map.getOrDefault(i,0);
            map.put(i,value+1);
        }
        for(Map.Entry<Integer,Integer> it: map.entrySet()){
            if(it.getValue()>=(n/2)){
                System.out.println(it.getKey());
            }
        }
    }
}
