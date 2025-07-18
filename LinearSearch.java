public class LinearSearch {
    public static int menuitem(String menu[], String key) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        String menu[] = { "Edli", "Dosa", "Rice", "Samosa", "Kachori", "Fruti" };
        String key = "Samosa";
        int index = menuitem(menu, key);

        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Index of Menuitem is : " + index);
        }

    }

}
