import java.util.Scanner;
public class WhatIfActivity {
    public static void main(String[] args) {
        int num1, num2;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("First number? : ");
        num1 = keyboard.nextInt();

        System.out.print("Second number? : ");
        num2 = keyboard.nextInt();

        int sum = num1 + num2;
        int product = num1 * num2;
        double average = (num1+num2)/2.0;

        if (sum < 1000){
            if (sum > 200){
                System.out.printf("Sum = %d*~ \nProduct = %d \naverage = %f", sum, product, average);
            }
            else{
                System.out.printf("Sum = %d~ \nProduct = %d \naverage = %f", sum, product, average);
            }
        }
        else{
            System.out.printf("Sum = %d \nProduct = %d \naverage = %f", sum, product, average);
        }
    }
}
