import java.util.*;

public class UseCase7PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "radar";
        Deque<Character> deque = new LinkedList<>();

        for(char c : word.toCharArray())
            deque.add(c);

        boolean palindrome = true;

        while(deque.size() > 1){
            if(deque.removeFirst() != deque.removeLast()){
                palindrome = false;
                break;
            }
        }

        System.out.println(palindrome ? "Palindrome" : "Not Palindrome");
    }
}