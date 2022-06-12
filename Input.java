import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Input {
    public static void main(String[] args){
        //taking integer input
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Age");
    int input = scan.nextInt();
    System.out.print("Entered age is: ");
    System.out.print(input);
       //taking string input
       Scanner scan1 = new Scanner(System.in);
    System.out.println("Enter Age");
    String input1 = scan1.next();
    System.out.print("Entered string is: ");
    System.out.print(input1);
    } 
}
