import java.util.*;
public class ArithmeticOperator {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("-- Arithmetic Operators Program --\n");

        //Takes first number from the user to perfrom arithmetic operation
        System.out.print("Please enter first number to perform operation: ");
        int num1 = input.nextInt();

        //Takes second number from the user to perfrom arithmetic operation
        System.out.print("Please enter first number to perform operation: ");
        int num2 = input.nextInt();
        System.out.println("\n");

        //Displaying the result
        System.out.println("-- Your Results Of Performing Two Numbers Are Here --\n");

        System.out.println("The Addition of two numbers by + operator : " + (num1 + num2));
        System.out.println("The Subtraction of two numbers by - operator : " + (num1 - num2));
        System.out.println("The Multiplication of two numbers by * operator : " + (num1 * num2));
        System.out.println("The Devision of two numbers by / operator : " + (num1 / num2));
        System.out.println("The Reminder of two numbers by % operator : " + (num1 % num2));

    }
}
