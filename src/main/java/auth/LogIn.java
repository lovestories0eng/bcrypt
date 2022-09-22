package auth;

import bCrypt.BCrypter;
import utils.DataReader;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import global.Constants;

import java.util.Objects;

public class LogIn {
    public boolean check(String account, String password) {
        JSONArray allUsers = DataReader.getAllUsers(Constants.relativePath + "/user.json");
        String hashedPassword = getHashedPasswordByAccount(allUsers, account);
        if (hashedPassword == null) return false;
        boolean flag = BCrypter.checkPassword(password, getHashedPasswordByAccount(allUsers, account));
        if (flag) {
            System.out.print("您密码的密文为：");
            System.out.println(hashedPassword);
            return true;
        } else {
            return false;
        }
    }

    public String getHashedPasswordByAccount(JSONArray jsonArray, String inputAccount) {
        for (Object json : jsonArray) {
            JSONObject key = (JSONObject) json;
            String account = (String) key.get("account");
            if (Objects.equals(account, inputAccount)) {
                return (String) key.get("hash_pw");
            }
        }
        // 遍历完如果没找到则返回null
        return null;
    }
}
