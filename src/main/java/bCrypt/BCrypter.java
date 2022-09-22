package bCrypt;

import org.mindrot.jbcrypt.BCrypt;

public  class BCrypter {
    // 密码的salt默认存储在加密密文中
    public static String generateSalt() {
        return BCrypt.gensalt();
    }

    public static String generateSalt(int logRounds) {
        return BCrypt.gensalt(logRounds);
    }

    public static String encodePassword(String password, String salt) {
        return BCrypt.hashpw(password, salt);
    }

    public static boolean checkPassword(String userPassword, String encodedPassword) {
        return BCrypt.checkpw(userPassword, encodedPassword);
    }
}
