class PalindromeService {

    public boolean checkPalindrome(String word) {

        String reversed = new StringBuilder(word).reverse().toString();

        return word.equals(reversed);
    }
}

public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        PalindromeService service = new PalindromeService();

        String word = "level";

        if(service.checkPalindrome(word))
            System.out.println(word + " is a Palindrome");
        else
            System.out.println(word + " is NOT a Palindrome");

    }
}