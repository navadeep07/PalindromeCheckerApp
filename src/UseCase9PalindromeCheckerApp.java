public class UseCase9PalindromeCheckerApp {

    static boolean check(String str,int start,int end){

        if(start >= end)
            return true;

        if(str.charAt(start) != str.charAt(end))
            return false;

        return check(str,start+1,end-1);
    }

    public static void main(String[] args) {

        String word="level";

        System.out.println(check(word,0,word.length()-1) ? "Palindrome" : "Not Palindrome");
    }
}