import auth.LogIn;

import java.util.Scanner;

public class MainProcess {
    public static void main(String[] args) {
        LogIn login = new LogIn();
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("请输入您的账号");
            String account = in.nextLine();
            System.out.println("请输入您的密码");
            String password = in.nextLine();
            if (login.check(account, password))
                System.out.println("登录成功");
            else System.out.println("登录失败");

        }

        // // Hash a password for the first time
        // String password = "hdu_222";
        // String hashed = BCrypt.hashpw(password, BCrypt.gensalt());
        // System.out.println(hashed);
        // // gensalt's log_rounds parameter determines the complexity
        // // the work factor is 2**log_rounds, and the default is 10
        // String hashed2 = BCrypt.hashpw(password, BCrypt.gensalt(14));
        //
        // // Check that an unencrypted password matches one that has
        // // previously been hashed
        // String candidate = "testpassword";
        // //String candidate = "wrongtestpassword";
        // if (BCrypt.checkpw(candidate, hashed2))
        //     System.out.println("It matches");
        // else
        //     System.out.println("It does not match");
    }

}
