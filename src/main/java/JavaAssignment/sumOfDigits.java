package JavaAssignment;

import java.util.Scanner;
//3.  Find out sum of digits of a number
//        Input: 152
//        Output: 8
public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}