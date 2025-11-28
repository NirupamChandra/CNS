import java.security.MessageDigest;

public class MD5 {
    public static void main(String[] args) throws Exception{

        String inp = "NirupamChandraKonda";

        MessageDigest md = MessageDigest.getInstance("MD5");

        byte[] d = md.digest(inp.getBytes());

        StringBuilder res = new StringBuilder();

        for(byte c : d){
            res.append(String.format("%02x", c));
        }

        System.out.println("MEssage Digest : " + res.toString());
    }
}
