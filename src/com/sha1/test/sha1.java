package com.sha1.test;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class sha1 {

    private static final String SSK = "00112233445566778899";

    public static String sha1_encryption(String DCC) {
        StringBuffer buffer = null;
        try {
            MessageDigest mDigest = MessageDigest.getInstance("SHA1");
            byte[] result = mDigest.digest((DCC + SSK).getBytes());
            buffer = new StringBuffer();
            for (int i = 0; i < result.length; i++) {
                buffer.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return buffer.toString();
    }

}