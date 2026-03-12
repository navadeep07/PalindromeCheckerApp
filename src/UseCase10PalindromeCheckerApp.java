public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "Madam In Eden Im Adam";

        String normalized = input.replaceAll("\\s+","").toLowerCase();
        String reversed = new StringBuilder(normalized).reverse().toString();

        System.out.println(normalized.equals(reversed) ? "Palindrome" : "Not Palindrome");
    }
}