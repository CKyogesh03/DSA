package pattern_logicbuilding;

public class Pattern15 {
    static void p1(int n){
        for (int i=n;i>0;i--){
            for (char j='A';j<'A'+i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void p2(int n){
        for (int i=0;i<n;i++){ // start from zero, for inner loop logic
            for (char j='A';j<='A'+(n-i-1);j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        p1(5);
        p2(5);
    }
}
