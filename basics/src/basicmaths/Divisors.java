package basicmaths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Divisors {
    public static void main(String[] args) {
        ArrayList<Integer> divisors=new ArrayList<>();

        int n=36;
        for (int i=1;i*i<=n;i++){ // i<=Math.sqrt(n)
            if(n%i==0){
                divisors.add(i);
                if ((n/i) != i){
                    divisors.add(n/i);
                }
            }
        }
        Collections.sort(divisors);
        System.out.println(divisors); // [1, 2, 3, 4, 6, 9, 12, 18, 36]
    }
}
