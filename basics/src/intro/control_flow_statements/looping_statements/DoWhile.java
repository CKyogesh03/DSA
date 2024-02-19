package intro.control_flow_statements.looping_statements;

public class DoWhile {
    public static void main(String[] args) {
        int i=1;
        do{
            System.out.println(i);
            i++;
        }
        while (i<=3);
        System.out.println("now i value is : "+i);
    }
}