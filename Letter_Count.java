// find the letter count in given sentence:

import java.util.Scanner;

public class Letter_Count{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("ENTER A SENTENCES : ");
        String Sentence = scan.nextLine();

        int Count = 0;

        Sentence = Sentence.toLowerCase();

        for(int i=0;i<Sentence.length();i++){
            char ch = Sentence.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                Count++;
            }
        }
        System.out.println("No of Letter Count is : "+Count);

    }
}
