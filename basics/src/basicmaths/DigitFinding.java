package basicmaths;

public class DigitFinding {
    static int modulus(int n){
        int count=0;
        while (n>0){
            count++;
            n=n/10;
        }
        return count;
    }
    static int logbase10(int n){
        int length= (int) (Math.log10(n)+1);
        return length;
    }
    public static void main(String[] args) {
        System.out.println(modulus(99999));
        System.out.println(logbase10(99999));

    }
}
