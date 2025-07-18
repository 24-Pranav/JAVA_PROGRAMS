package CodingQuetions;

public class MoneyCount {
    public static int countMonkeys(int totalMonkeys, int bananas, int peanuts, int offerbananas, int offerpeanuts) {

        if (totalMonkeys < 0 || bananas < 0 || peanuts < 0 || offerbananas < 0 || offerpeanuts < 0) {
            return 0;
        }

        int remMonkeys = bananas / offerbananas + peanuts / offerpeanuts;

        return totalMonkeys - remMonkeys;
    }

    public static void main(String[] args) {
        int totalMonkeys = 12;
        int bananas = 12;
        int peanuts = 12;
        int offerbananas = 2;
        int offerpeanuts = 3;

        if (countMonkeys(totalMonkeys, bananas, peanuts, offerbananas, offerpeanuts) == 0) {
            System.out.println("Invalid inputs");
        } else {
            System.out.println(countMonkeys(totalMonkeys, bananas, peanuts, offerbananas, offerpeanuts));
        }
    }
}
