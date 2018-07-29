package com.becomeJavaPro.springmvc;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Utils {
    public static void main(String[] args) {
            String password = "java9proUpdated";
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
         System.out.println(passwordEncoder.encode(password));

        }
}
