interface PalindromeStrategy {

    boolean isPalindrome(String word);
}

class StackStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String word) {

        String reversed = new StringBuilder(word).reverse().toString();

        return word.equals(reversed);
    }
}

public class UseCasePalindromeCheckerApp12 {

    public static void main(String[] args) {

        String word = "madam";

        PalindromeStrategy strategy = new StackStrategy();

        if (strategy.isPalindrome(word)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }

    }
}