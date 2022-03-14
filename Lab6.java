// GitHub Testing Calculator 3/14/2022

import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("This program adds two integers together!\n");
        System.out.print("Please enter the first integer: ");
        int input1 = scan.nextInt();

        System.out.print("Please enter the second integer: ");
        int input2 = scan.nextInt();

        System.out.println(input1 + " + " + input2 + " is equal to: " + (input1 + input2));
    }
}
