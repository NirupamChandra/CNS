import java.util.Scanner;

public class SubstituteCipher {
    
    static String plain = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmonpqrstuvwxyz";
    static String cipher = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm";

    public static void main(String[] args){

        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter Input : ");
        String inp = in.nextLine();

        String enc = encrypt(inp);
        String dec = decrypt(enc);

        System.out.println("Encrypted : " + enc);
        System.out.println("Decrypted : " + dec);

    }

    public static String encrypt(String inp){

        StringBuilder sb = new StringBuilder();

        for(char c : inp.toCharArray()){

            if(Character.isLetter(c)){
                int indx = plain.indexOf(c);
                sb.append((char) cipher.charAt(indx));
            }
            else{
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static String decrypt(String enc){
        StringBuilder sb = new StringBuilder();

        for(char c: enc.toCharArray()){
            if (Character.isLetter(c)){
                int indx = cipher.indexOf(c);
                sb.append((char) plain.charAt(indx));
            }
            else{
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
