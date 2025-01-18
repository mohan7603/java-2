import java.util.Scanner;

public class CalculateVowelsConsonant{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("ENTER A STRING :");
        String Input = scan.nextLine();

        int VowelCount = 0;
        int ConsonantCount = 0;

        Input = Input.toLowerCase();

        for(int i=0;i<Input.length();i++){

            char ch = Input.charAt(i);

            if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u'){
                VowelCount++;
            }
            else if((ch >= 'a'&& ch <= 'z')){
                ConsonantCount++;
            }

        }
        System.out.println("VowelCount : "+VowelCount);
        System.out.println("ConsonantCount : "+ConsonantCount);
    }
}