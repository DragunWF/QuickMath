package dragunwf.quickmath.scripts;

import java.util.ArrayList;

public class Utils {
    public static String formatNumber(Integer number) {
        if (number < 1000) {
            return number.toString();
        }
        
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
    
    public static boolean validateSubmission(String input) {
        int[] digitRange = { 48, 57 }; // int to char ascii_representation
        for (char character : input.toCharArray()) {
            int charDigit = (int) character;
            if (charDigit >= digitRange[0] && charDigit <= digitRange[1]) {
                continue;
            }
            return false;
        }
        return true;
    }

    private static char[] reverseCharArray(char[] arr) {
        char[] output = new char[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            output[arr.length - (i + 1)] = arr[i];
        }
        return output;
    }
}