package utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import global.Constants;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class DataReader {
    //读取json文件
    public static String readJsonFile(String fileName) {
        String jsonStr;
        try {
            File jsonFile = new File(fileName);
            FileReader fileReader = new FileReader(jsonFile);
            Reader reader = new InputStreamReader(new FileInputStream(jsonFile), StandardCharsets.UTF_8);
            int ch;
            StringBuilder sb = new StringBuilder();
            while ((ch = reader.read()) != -1) {
                sb.append((char) ch);
            }
            fileReader.close();
            reader.close();
            jsonStr = sb.toString();
            return jsonStr;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static JSONArray getAllUsers(String filePath) {
        String absolutePath = new File("").getAbsolutePath();
        filePath = absolutePath + filePath;
        String s = readJsonFile(filePath);
        JSONObject jsonObj = JSON.parseObject(s);
        return jsonObj.getJSONArray(Constants.userTableName);
    }
}
