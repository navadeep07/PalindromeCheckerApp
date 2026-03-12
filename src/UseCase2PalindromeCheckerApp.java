public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";   // Hardcoded string
        String reversed = "";

        // Reverse the string
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Print the word
        System.out.println("Given Word: " + word);

        // Check palindrome
        if (word.equals(reversed)) {
            System.out.println("Result: The word is a Palindrome");
        } else {
            System.out.println("Result: The word is NOT a Palindrome");
        }

    }
}