package dragunwf.quickmath;

import java.util.*;

public class Utils {
    public static String formatNumber(Integer number) {
        char[] numCharArr = number.toString().toCharArray();
        numCharArr = reverseCharArray(numCharArr);
        ArrayList<String> output = new ArrayList<>();

        for (int i = 0; i < numCharArr.length; i++) {
            output.add(Character.toString(numCharArr[i]));
            if ((i + 1) % 3 == 0) {
                output.add(",");
            }
        }
        
        char[] resultCharArray = String.join("", output).toCharArray();
        resultCharArray = reverseCharArray(resultCharArray);

        return String.valueOf(resultCharArray);
    }

    private static char[] reverseCharArray(char[] arr) {
        char[] output = new char[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            output[arr.length - (i + 1)] = arr[i];
        }
        return output;
    }
}