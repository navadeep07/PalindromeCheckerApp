import java.util.Stack;

public class UseCase5PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "level";
        Stack<Character> stack = new Stack<>();

        for(char c : word.toCharArray())
            stack.push(c);

        String reversed = "";

        while(!stack.isEmpty())
            reversed += stack.pop();

        System.out.println(word.equals(reversed) ? "Palindrome" : "Not Palindrome");
    }
}