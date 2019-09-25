package com.example.demo1192019;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoderUtil {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encoded = encoder.encode("keerthana");
        System.out.println(encoded);
        encoded = encoder.encode("admin");
        System.out.println(encoded);
    }
}