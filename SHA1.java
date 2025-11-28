import java.security.MessageDigest;

public class SHA1 {
    
    public static void main(String[] atgs) throws Exception{

        String inp = "NirupamChandraKonda";

        MessageDigest md = MessageDigest.getInstance("SHA1");

        byte[] d = md.digest(inp.getBytes());

        StringBuilder res = new StringBuilder();

        for(byte b : d){
            res.append(String.format("%02x", b));
        }

        System.out.println("SHA1 Digest : " + res.toString());
    }
}
