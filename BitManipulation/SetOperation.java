package BitManipulation;

import java.util.Scanner;

public class SetOperation { //Used to change the bit to 1 at a given position 0/1 -> 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        System.out.println("Enter the position : ");
        int position = sc.nextInt();

        int bitMask = 1<<position; //move 1 to the specified position
        int newNumber = (bitMask | number); //x | 1 = 1
        System.out.println(newNumber);
    }
}
