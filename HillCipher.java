
import java.util.Scanner;

public class HillCipher{

    static int [][]key = {{3 ,3}, {4, 5}};

    public static void main(String [] args){

        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.print("Enter input : ");
        String inp = in.nextLine();
        
        System.out.println("Encrypted text : " + encrypt(inp));
    }

    public static String encrypt(String inp){

        StringBuilder sb = new StringBuilder();

        String inputText = inp.toUpperCase();

        if (inputText.length() % 2 != 0){
            inputText = inputText + 'X';
        }

        for (int i=0; i<inputText.length(); i+=2)
        {
            int p1 = inputText.charAt(i) - 'A';
            int p2 = inputText.charAt(i+1) - 'A';

            int c1 = ((key[0][0]*p1 + key[0][1]*p2)%26);
            int c2 = ((key[1][0]*p1 + key[1][1]*p2)%26);

            sb.append((char) (c1 + 'A'));
            sb.append((char) (c2 + 'A'));
        }
        return sb.toString();
        
    }
}
