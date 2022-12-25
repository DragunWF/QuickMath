package dragunwf.quickmath;

import java.util.*;

public class Utils {
    public static void formatNumber(Integer number) {
        char[] numCharArr = number.toString().toCharArray();
        Arrays.sort(numCharArr);
        String strNum = number.toString();
        ArrayList<String> output = new ArrayList<String>();
        
        for (int i = 0, n = strNum.length(); i < n; i++) {
            output.add(Character.toString(strNum.charAt(i)));
            if (i + 1 % 3 == 0) {
                output.add(",");
            }
        }
    }
}
