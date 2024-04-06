package BitManipulation;

import java.util.Scanner;

public class ClearOperation { //Used to change the bit to 0 at a given position 0/1 -> 0
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        System.out.println("Enter the position : ");
        int position = sc.nextInt();

        int bitMask = 1<<position; //move 1 to the specified position
        int notBitMask = ~(bitMask);//it will make the position bit as 0 and other as 1
        int newNumber = number & notBitMask;// x & 0 = 0 x & 1 = x
        System.out.println(newNumber);
    }
}
