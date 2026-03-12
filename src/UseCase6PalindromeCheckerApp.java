import java.util.*;

public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for(char c : word.toCharArray()){
            queue.add(c);
            stack.push(c);
        }

        boolean palindrome = true;

        while(!queue.isEmpty()){
            if(queue.remove() != stack.pop()){
                palindrome = false;
                break;
            }
        }

        System.out.println(palindrome ? "Palindrome" : "Not Palindrome");
    }
}