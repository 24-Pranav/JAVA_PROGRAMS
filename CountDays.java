import java.util.HashMap;

public class CountDays {
    // count sunday

    public static void main(String[] args) {
        HashMap<String, Integer> days = new HashMap<>();
        String weekDays[] = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

        for (int i = 0; i < weekDays.length; i++) {
            days.put(weekDays[i], i + 1);
        }

        String firstDay = "Tuesday";
        int n = 13;

        n = n - (days.get("Sunday") - days.get(firstDay));
        int totalSun = n / 7;

        System.out.println("Total sundays = " + (totalSun));
    }
}
