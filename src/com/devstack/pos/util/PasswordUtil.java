package com.devstack.pos.util;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordUtil {
    public static String hash(String rawPassword){
       return BCrypt.hashpw(rawPassword,BCrypt.gensalt(10));
    }

    public static boolean checkPassword(String hash, String rawPassword){
        return BCrypt.checkpw(rawPassword,hash);
    }
}
