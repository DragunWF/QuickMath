package dragunwf.quickmath;

import java.util.ArrayList;

public class DebugTool {
    public static void displayArrayList(ArrayList<String> arr) {
        for (int i = 0, n = arr.size(); i < n; i++) {
            System.out.printf("%s: %s ", i, arr.get(i));
        }
        System.out.println();
    }
    
    public static void displayCharArray(char[] arr) {
        for (char chr : arr) {
            System.out.printf("%s ", chr);
        }
        System.out.println();
    }
}
