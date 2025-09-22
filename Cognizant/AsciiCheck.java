package Cognizant;

public class AsciiCheck {

    public static void main(String[] args) {
        int arr[] = { 115, 116, 117, 118 };

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "-" + (char) arr[i]);
        }
    }

}
