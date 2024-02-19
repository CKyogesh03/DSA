package function;

//Functions are set of code which performs something for you
//functions are used to modularise code
//functions are used to increase readability
//functions are used to use same code multiple times
//void -> which does not returns anything . it will do something to us but will not carry anything to us
// return -> it returns data. it carry data from the function and give to us.
//parameterised -> function accept specific number of data from the caller
// function declared with a local variable to store the data sent from the caller.
//non-parameterised -> function doesn't accept any data from the caller
public class FunctionBasic {
    static void returnNothing(){
        System.out.println("just printing");
    }
    static int returnSomething(){
        System.out.println("returning data");
        return 3;
    }
    static void nonParameterised(){

    }
    static void Parameterised(int n1,int n2){
        int sum = n1 + n2;
        System.out.println();
    }
    public static void main(String[] args) {

    }
}