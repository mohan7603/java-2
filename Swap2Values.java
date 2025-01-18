// SWAP TWO VALUES WITHOUT 3RD VARIABLE:

import java.util.Scanner;

public class Swap2Values{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER VALUE OF A : ");
        int a = scan.nextInt();
        System.out.println("ENTER VALUE OF B : ");
        int b = scan.nextInt();

        System.out.println("Before Swapping.....");
        System.out.println("a : "+a);
        System.out.println("b : "+b);

        a=a+b;  
        b=a-b;
        a=a-b;

        System.out.println("After Swapping.....");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }
}