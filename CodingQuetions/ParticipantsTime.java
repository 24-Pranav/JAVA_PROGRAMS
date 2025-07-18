package CodingQuetions;

import java.util.TreeMap;

public class ParticipantsTime {
    public static void main(String[] args) {

        TreeMap<Double, Integer> map = new TreeMap<>();
        double count = 0;

        double participants[] = { 12.5, 10.2, 11.2, 13.3 };

        for (int i = 0; i < participants.length; i++) {
            map.put(participants[i], i);
            count += participants[i];
        }

        double min = map.firstKey();
        
        System.out.println("Minimum completion time = " + min);
        System.out.println("Average = " + (count / participants.length));
    }
}
