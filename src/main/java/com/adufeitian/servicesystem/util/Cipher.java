package com.adufeitian.servicesystem.util;

import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class Cipher {
    private static javax.crypto.Cipher getCipher(int mode, byte[] key, byte[] iv) throws Exception{
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(key, "AES");
        cipher.init(mode, secretKeySpec, new IvParameterSpec(iv));
        return cipher;
    }
    private static byte[] AES_CBC_Decrypt(byte[] data, byte[] key, byte[] iv) throws Exception{
        javax.crypto.Cipher cipher = getCipher(javax.crypto.Cipher.DECRYPT_MODE, key, iv);
        return cipher.doFinal(data);
    }
    private static byte[] AES_CBC_Encrypt(byte[] data, byte[] key, byte[] iv) throws Exception{
        javax.crypto.Cipher cipher = getCipher(javax.crypto.Cipher.ENCRYPT_MODE, key, iv);
        return cipher.doFinal(data);
    }
    public static double bytesToDouble(byte[] arr) {
        long value = 0;
        for (int i = 0; i < 8; i++) {
            value |= ((long) (arr[i] & 0xff)) << (8 * i);
        }
        return Double.longBitsToDouble(value);
    }
    public static byte[] doubleToBytes(double d) {
        long value = Double.doubleToRawLongBits(d);
        byte[] byteRet = new byte[8];
        for (int i = 0; i < 8; i++) {
            byteRet[i] = (byte) ((value >> 8 * i) & 0xff);
        }
        return byteRet;
    }
    public static String getMessageDecrypt(String DecryptMessage, byte[] key,byte[] iv) {
        try {
            byte[] base64Message = Base64.getDecoder().decode(DecryptMessage);
            byte[] s = AES_CBC_Decrypt(base64Message, key, iv);
            String res = new String(s);
            return res;
        }catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }
    public static String getMessageEncrypt(String EncryptMessage, byte[] key,byte[] iv) {
        try {
            byte[] resultBytes = AES_CBC_Encrypt(EncryptMessage.getBytes(),key,iv);
            return Base64.getEncoder().encodeToString(resultBytes);
        }catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }
}
