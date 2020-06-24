package com.adufeitian.servicesystem.security;

import com.adufeitian.servicesystem.util.Cipher;

public class PasswordCipher {
    private static byte[] key = "15919f558ab5f986".getBytes();
    private static byte[] iv = "ab14f657a24f40bd".getBytes();
    public static String getEncryptPassword(String originPassword) {
        return Cipher.getMessageEncrypt(originPassword,key,iv);
    }
    public static String getOriginPassword(String encrypedPassword) {
        return Cipher.getMessageEncrypt(encrypedPassword,key,iv);
    }
}
