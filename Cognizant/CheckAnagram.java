package Cognizant;

import java.util.HashMap;

public class CheckAnagram {
    static boolean areAnagram(String S1, String S2) {
    
        if(S1.length() != S2.length()){
            return false;
        }
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i = 0; i < S1.length(); i++){
            map.put(S1.charAt(i), map.getOrDefault(S1.charAt(i),0) + 1);
        }
        
        for(int i = 0; i < S2.length(); i++){
            if(!map.containsKey(S2.charAt(i))){
                return false;
            }else{
                int count = map.get(S2.charAt(i));
                if (count == 1) {
                    map.remove(S2.charAt(i));
                } 
                else {
                    map.put(S2.charAt(i), count - 1);
                }
            }
        }
        
        return true;
    }
    public static void main(String[] args) {
        String s = "jar", t = "jam";
        System.out.println(areAnagram(s, t));
    }
}
