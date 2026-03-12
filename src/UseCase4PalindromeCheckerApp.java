public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";
        char[] arr = word.toCharArray();

        int start = 0;
        int end = arr.length - 1;
        boolean palindrome = true;

        while(start < end){
            if(arr[start] != arr[end]){
                palindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println(palindrome ? "Palindrome" : "Not Palindrome");
    }
}