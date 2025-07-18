public class ArrayPairs {
    // making pairs in array using nested loops

    public static void printPairs(int numbers[]) {
        int totalpairs = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + numbers[i] + "," + numbers[j] + ")");
                totalpairs++;
            }
            System.out.println("");
        }
        System.out.println("Total Number of Pairs : " + totalpairs);

    }

    public static void main(String args[]) {
        int numbers[] = { 1, 2, 4, 6, 8 };

        printPairs(numbers);

    }
}
