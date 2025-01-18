// Find the Count Of Word in a Given Sentence:

import java.util.Scanner;

public class WordCount{
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        System.out.println("ENTER A SENTENCE : ");
        String input = scan.nextLine();

        String[] Words = input.trim().split("\\s+");

        int WordCount = Words.length;

        System.out.println("Word Count : "+WordCount );




    }
}
