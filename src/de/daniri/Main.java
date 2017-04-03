package de.daniri;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ask for number */
        System.out.println("Enter your number: ");

        /* InputScanner */
        Scanner sc = new Scanner(System.in);

        /* save input local */
        int input = sc.nextInt();

        /* counter */
        int counter = 0;

        /* check if number is in range */
        if (input >= 3 && input <= 100){
            System.out.print("Divider: ");
            /* iterate from 2 to input */
            for (int i = 2; i < input; i++){
                /* divide input where we at i */
                int temp = (input / i);
                /* check if the integer division is correct */
                if ((temp * i) == input){
                    /* print and set counter += 1 */
                    System.out.print(temp + ", ");
                    counter++;
                }
            }
            /* check if prime number */
            if(counter == 0){
                System.out.println("no dividers");
                System.out.println(input + " is a Prime Number");
            }else {
                System.out.println("Counter: " + counter);
            }
        /* if not in range print error */
        }else {
            System.out.println("Number not in range");
        }
    }

}
