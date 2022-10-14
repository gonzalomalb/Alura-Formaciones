package com.proyect.test;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TestUnicodeEncoding {

    public static void main(String[] args) throws UnsupportedEncodingException {

        String word = "A";
        System.out.println("Codepoint: " + word.codePointAt(0));

        //Charset charset = Charset.defaultCharset();
        Charset charset = Charset.forName("UTF-8");
        System.out.println("Charset: " + charset.displayName());

        byte[] bytes = word.getBytes(StandardCharsets.UTF_16);
        System.out.println("Amount of bytes: " + bytes.length);

    }
}
