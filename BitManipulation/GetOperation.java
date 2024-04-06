package BitManipulation;

import java.util.Scanner;

public class GetOperation { //Used to find the bit at a given position 0->0 1->1

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        System.out.println("Enter the position : ");
        int position = sc.nextInt();

        int bitMask = 1<<position; //move 1 to the specified position
        if((bitMask & number) == 0){ //x & 1 = x
            System.out.println("The bit at position : "+position+ " is 0");
        }else {
            System.out.println("The bit at position : "+position+ " is 1");
        }

    }
}
