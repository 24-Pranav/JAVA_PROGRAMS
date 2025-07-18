import java.util.Comparator;

public class Arrays {
    public static void show(int arr[], int changenumber) {
        changenumber = 10;
        for (int i = 0; i < arr.length; i++)
            arr[i] = arr[i] + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 17, 18, 19 };
        int changenumber = 5;
        show(arr, changenumber);
        System.out.println(changenumber);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void sort(double[][] ratio, Comparator<Object> comparingDouble) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sort'");
    }
}
