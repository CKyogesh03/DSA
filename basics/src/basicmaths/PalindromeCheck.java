package basicmaths;

public class PalindromeCheck {
    public static void main(String[] args) {
        int n=131; int duplicate=n;
        int reverse=0;
        while (n>0){
            int lastDigit=n%10;
            reverse=(reverse*10)+lastDigit;
            n=n/10;
        }
        String result=(reverse==duplicate)?"Palindrome":"Not a Palindrome";
        System.out.println(result);
    }
}
