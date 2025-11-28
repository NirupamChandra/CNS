import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class AESsame {
    public static void main(String []args) throws Exception{

        String inp = "NirupamChandra Konda12$324%^45";

        KeyGenerator kg = KeyGenerator.getInstance("AES");
        kg.init(128);

        SecretKey keys = kg.generateKey();

        Cipher enc = Cipher.getInstance("AES");
        enc.init(Cipher.ENCRYPT_MODE, keys);

        byte[] encrypted = enc.doFinal(inp.getBytes());
        String ency = Base64.getEncoder().encodeToString(encrypted);

        Cipher dec = Cipher.getInstance("AES");
        dec.init(Cipher.DECRYPT_MODE, keys);

        String decy = new String(dec.doFinal(encrypted));

        System.out.println("Original : " + inp);
        System.out.println("Encrypted : " + ency);
        System.out.println("Decrypted : " + decy);

    }
}
