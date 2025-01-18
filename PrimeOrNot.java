// Find the Number Prime or Not:

import java.util.Scanner;

public class PrimeOrNot{
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER A NUMBER : ");
        int num = scan.nextInt();

        int count = 0;

        for(int i=1;i<=num;i++ ){
            if(num%i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println(num+" "+"is a Prime Number");
        }
        else{
           System.out.println(num+" "+"is a Not Prime Number"); 
        }

    }
}