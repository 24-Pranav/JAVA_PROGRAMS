package Cognizant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GroupAnagram {
    static public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        ArrayList<ArrayList<String>> main = new ArrayList<>();
        
        for(String str : arr){
            
            char charArray[] = str.toCharArray();
            Arrays.sort(charArray);
            
            String sorted = new String(charArray);
            
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            
            map.get(sorted).add(str);
        }
        
        for(String str : map.keySet()){
            main.add(map.get(str));
        }
        
        return main;
    }
    public static void main(String[] args) {
        String strs[] = {"act","pots","tops","cat","stop","hat"};
        System.out.println(anagrams(strs));
    }
}
