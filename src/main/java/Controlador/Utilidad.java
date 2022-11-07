package Controlador;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.Serializable;
import java.security.spec.KeySpec;
import java.util.Base64;

public class Utilidad implements Serializable {

       private static final String key = "DiHA!l*opusOke@&@H6b";
       private static final String salt = "9ruwehUPR?sasegacHlD";

       private SecretKey secretKeyTemp;

       public Utilidad(){
           SecretKeyFactory secretKeyFactory;
           KeySpec keySpec;

           try {
               secretKeyFactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA512");
               keySpec = new PBEKeySpec(key.toCharArray(), salt.getBytes(),65536,256);
               secretKeyTemp = secretKeyFactory.generateSecret(keySpec);

           }catch (Exception e){
               e.printStackTrace();
           }
       }

       public String encriptar(String data){
           byte [] iv = new byte[16];
           try {
               IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);
               SecretKeySpec secretKey = new SecretKeySpec(secretKeyTemp.getEncoded(), "AES");
               Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
               cipher.init(Cipher.ENCRYPT_MODE,secretKey,ivParameterSpec);
               return Base64.getEncoder().encodeToString(cipher.doFinal(data.getBytes("UTF-8")));
           }catch (Exception e){
               e.printStackTrace();
           }
           return null;
       }

    public  String desencriptarPass(String data){
        byte [] iv = new byte[16];
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);
            SecretKeySpec secretKey = new SecretKeySpec(secretKeyTemp.getEncoded(), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE,secretKey,ivParameterSpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(data)));
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }






}
