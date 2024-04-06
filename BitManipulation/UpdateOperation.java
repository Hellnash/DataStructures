package BitManipulation;

import java.util.Scanner;
public class UpdateOperation { //Used to interchange the bit in a specified position 0 <-> 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        System.out.println("Enter the position : ");
        int position = sc.nextInt();

        System.out.println("Enter whether you want to change 0->1 or 1->0");
        int choice = sc.nextInt();

        int newNumber;
        int bitMask = 1<<position; //move 1 to the specified position
        int notBitMask = ~(bitMask);
        if (choice == 0)
        {
         newNumber =  number & notBitMask; //clear operation 1 -> 0
        }else {
            newNumber = number | bitMask; //set operation 0 -> 1
        }
        System.out.println(newNumber);
    }
}
