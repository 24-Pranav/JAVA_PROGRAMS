package Cognizant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TopKFrequent {
    public static ArrayList<Integer> topKFrequent(int[] arr, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++){
            
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            
            ArrayList<Integer> pair = new ArrayList<>();
            pair.add(entry.getValue());
            pair.add(entry.getKey());
            
            list.add(pair);
        }
        
        list.sort((a, b) -> {
        if (!a.get(0).equals(b.get(0))) {
                return b.get(0) - a.get(0);
            }       
            else {
                return b.get(1) - a.get(1);
            }
        });

        
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i = 0; i < k && i < list.size(); i++){
            result.add(list.get(i).get(1));
        }
        
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {7,7};
        System.out.println(topKFrequent(arr,2));
    }
}
