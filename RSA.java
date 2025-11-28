import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;
import javax.crypto.Cipher;

public class RSA {
    public static void main(String[] args) throws Exception{

        KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
        kpg.initialize(512);

        KeyPair kp = kpg.generateKeyPair();

        PrivateKey privateK = kp.getPrivate();
        PublicKey publicK = kp.getPublic();

        String inp = "nirupamChandraKonda";

        Cipher enc = Cipher.getInstance("RSA");
        enc.init(Cipher.ENCRYPT_MODE, publicK);
        byte[] encrypted = enc.doFinal(inp.getBytes());
        String ency = Base64.getEncoder().encodeToString(encrypted);

        Cipher dec = Cipher.getInstance("RSA");
        dec.init(Cipher.DECRYPT_MODE, privateK);
        String decy = new String(dec.doFinal(encrypted));

        System.out.println("Original : " + inp);
        System.out.println("Encrypted : " + ency);
        System.out.println("Decrypted : " + decy);

    }
}
