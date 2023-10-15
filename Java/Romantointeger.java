import java.util.*;

public class Romantointeger {
    public static void main(String[] args) {
        // Input Roman numeral
        System.out.println("Enter the Roman Value");
        Scanner sc=new Scanner(System.in);
        String romanNumeral = sc.nextLine(); 

        int result = romanToInt(romanNumeral);
        System.out.println("Integer representation: " + result);
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentVal = romanValues.get(s.charAt(i));

            if (i < s.length() - 1) {
                int nextVal = romanValues.get(s.charAt(i + 1));
                if (currentVal < nextVal) {
                    result -= currentVal;
                } else {
                    result += currentVal;
                }
            } else {
                result += currentVal;
            }
        }

        return result;
    }
}
