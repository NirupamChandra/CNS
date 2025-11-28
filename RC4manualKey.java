
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class RC4manualKey {
    
    public static void main(String[] args) throws Exception{
        
        String inp = "NirupamChandraKonda";

        byte[] keyBytes = "mySecretMiniNiru".getBytes();
        SecretKeySpec keys = new SecretKeySpec(keyBytes, "RC4");

        Cipher enc = Cipher.getInstance("RC4");
        enc.init(Cipher.ENCRYPT_MODE, keys);
        
        byte[] encrypted = enc.doFinal(inp.getBytes());
        String ency = Base64.getEncoder().encodeToString(encrypted);

        Cipher dec = Cipher.getInstance("RC4");
        dec.init(Cipher.DECRYPT_MODE, keys);

        String decy = new String(dec.doFinal(encrypted));

        System.out.println("Original : "+ inp);
        System.out.println("Encrypted : " + ency);
        System.out.println("Decrypted : " + decy);
        
    }
}
