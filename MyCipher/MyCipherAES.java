package MyCipher;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class MyCipherAES {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        String s = "hello worlds";

        Cipher cipher = Cipher.getInstance("AES");

        //random
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);
        SecretKey key = keyGenerator.generateKey();

        //permanent
        SecretKeySpec secretKeySpec = new SecretKeySpec("1234567890123456".getBytes(), "AES"); //16

        //encode
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
        byte[] bytes = cipher.doFinal(s.getBytes());
        for(byte b : bytes){
            System.out.print(b);
        }

        System.out.println("");

        //decode
        Cipher decriptCipher = Cipher.getInstance("AES");
        decriptCipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
        byte[] decriptBytes = decriptCipher.doFinal(bytes);
        for (byte b : decriptBytes){
            System.out.print((char)b);
        }
    }
}
