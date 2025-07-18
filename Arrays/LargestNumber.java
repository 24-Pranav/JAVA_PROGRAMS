package Arrays;

public class LargestNumber {

    public static int Largest(int largest[]) {

        int largestNum = Integer.MIN_VALUE;
        int smallestNum = Integer.MAX_VALUE;

        for (int i = 0; i < largest.length; i++) {
            if (largestNum < largest[i]) {
                largestNum = largest[i];
            }
            if (smallestNum > largest[i]) {
                smallestNum = largest[i];
            }
        }
        System.out.println("Smallest Number is : " + smallestNum);
        return largestNum;
    }

    public static void main(String args[]) {
        int largest[] = { 1, 2, 6, 5, 3, 4 };

        System.out.println("Largest Number is : " + Largest(largest));
    }

}
