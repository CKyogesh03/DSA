package pattern_logicbuilding;

/*

 *
 **
 ***
 ****
 *****
 ****
 ***
 **
 *

 */
public class Pattern10 {
    static void p1(int n){
        for (int i=1;i<=2*n-1;i++){
            int stars=i;
            if(stars>n) stars=2*n-i;
            for (int j=1;j<=stars;j++){
                System.out.print("*"); //without space
            }
            System.out.println();
        }
    }
    static void p2(int n){
        for (int i=0;i<2*n;i++){
            int stars = i>n?2*n-i:i;
            for (int j=0;j<stars;j++){
                System.out.print("* "); //aligned with space
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        p1(3);
        System.out.println("=========sample================");
        p2(5);
    }
}
