import java.util.Scanner;

public class CeaserCipher {
    
    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the input text : ");
        String inp = in.nextLine();

        System.out.println("Enter shift value : ");
        int shift = in.nextInt();

        String enc = encrypt(inp, shift);
        String dec = decrypt(enc, shift);

        System.out.println("Encrypted : " + enc);
        System.out.println("Decrypted : " + dec);
        
    }

    public static String encrypt(String inp, int shift){

        StringBuilder sb = new StringBuilder();

        for(char c : inp.toCharArray()){
            if (Character.isUpperCase(c)){
                sb.append((char)((c - 'A' + shift)%26 + 'A'));
            }
            else if(Character.isLowerCase(c)){
                sb.append((char)((c - 'a' + shift)%26 + 'a'));
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String decrypt(String enc, int shift){
        return encrypt(enc, 26 - shift);
    }
}
