import java.util.*;

public class Pangramornot {
    public static void main(String[] args) {
        System.out.println("Enter Your Sentece to check");
        Scanner sc=new Scanner(System.in);

        String input = sc.nextLine(); // Replace this with your input
        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        // Remove spaces and convert to lowercase
        input = input.replaceAll(" ", "").toLowerCase();

        // Use a HashSet to store the unique letters in the input
        HashSet<Character> uniqueLetters = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                uniqueLetters.add(ch);
            }
        }

        // Check if there are 26 unique letters (the English alphabet)
        return uniqueLetters.size() == 26;
    }
}
