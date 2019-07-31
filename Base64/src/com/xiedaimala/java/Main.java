package com.xiedaimala.java;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        // write your code here
        try {

            //使用基本编码
            String base64encodedString = Base64.getEncoder().encodeToString("runnoob?java8".getBytes("utf-8"));
            System.out.println("Base64编码字符串（基本）：" + base64encodedString);

            //解码
            byte[] base64decodedBytes = Base64.getDecoder().decode(base64encodedString);

            System.out.println("原始字符串：" + new String(base64decodedBytes, "utf-8"));
            base64encodedString = Base64.getUrlEncoder().encodeToString("TutorialsPoint?java8".getBytes("utf-8"));
            System.out.println("Base编码字符串URL：" + base64encodedString);

            StringBuilder stringBuilder = new StringBuilder();
            for (int i=0; i < 10; i++) {
                stringBuilder.append(UUID.randomUUID().toString());
            }

            byte[] mineBytes = stringBuilder.toString().getBytes("utf-8");
            String mimeEncodedString = Base64.getMimeEncoder().encodeToString(mineBytes);
            System.out.println("Base64 编码字符串（MINE）：" + mimeEncodedString);

        } catch (UnsupportedEncodingException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
}
