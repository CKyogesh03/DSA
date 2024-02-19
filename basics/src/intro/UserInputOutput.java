package intro;

import java.util.Scanner;

public class UserInputOutput {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //note: Scanner methods accept input from user and return it
        System.out.println("Enter Your name: ");
        System.out.println("welcome " + s.next()); // printing returned value directly without storing in variable

        System.out.println("======================================");

        System.out.println("Enter Your age : ");
        int age=s.nextInt();
        System.out.println("Yogesh your age is "+ age);

    }
}