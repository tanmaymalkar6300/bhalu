

import java.util.Scanner;

public class Malkar {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the  input");
       String userInput = scan.nextLine();

        System.out.println("You entered:" + userInput);

        //Closer  the scanner
        scan.close();



    }

}
