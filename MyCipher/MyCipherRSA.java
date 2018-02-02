package MyCipher;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.security.*;

public class MyCipherRSA {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        String s = "hello worlds";

        Cipher cipher = Cipher.getInstance("RSA");
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");

        //random
        //SecureRandom random = new SecureRandom();
        //keyPairGenerator.initialize(512, random);

        //permanent
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        Key publicKey = keyPair.getPublic();
        Key privateKey = keyPair.getPrivate();

        //encode
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        byte[] bytes = cipher.doFinal(s.getBytes());
        for(byte b : bytes){
            System.out.print(b);
        }

        System.out.println("");

        //decode
        Cipher decriptCipher = Cipher.getInstance("RSA");
        decriptCipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] decriptBytes = decriptCipher.doFinal(bytes);
        for (byte b : decriptBytes){
            System.out.print((char)b);
        }
    }
}
