package pattern_logicbuilding;

//similar to pattern 7. so code copied from pattern7

public class Pattern17 {
    static void p1(int n){
        for(int i=0;i<n;i++){
            //white space in LHS
            for (int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //stars in center
            char ch='A';
            int breakPoint=(2*i+1)/2;
            for (int j=1;j<=2*i+1;j++){
                System.out.print(ch);
                if (j<=breakPoint){
                    ch++;
                }
                else ch--;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        p1(3);
        System.out.println("===============sample===============");
        p1(5);
    }
}
