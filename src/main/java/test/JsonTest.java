package test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import global.Constants;


import java.io.*;
import java.nio.charset.StandardCharsets;


// public class JsonTest {
//
//     //读取json文件
//     public static String readJsonFile(String fileName) {
//         String jsonStr;
//         try {
//             File jsonFile = new File(fileName);
//             FileReader fileReader = new FileReader(jsonFile);
//             Reader reader = new InputStreamReader(new FileInputStream(jsonFile), StandardCharsets.UTF_8);
//             int ch;
//             StringBuilder sb = new StringBuilder();
//             while ((ch = reader.read()) != -1) {
//                 sb.append((char) ch);
//             }
//             fileReader.close();
//             reader.close();
//             jsonStr = sb.toString();
//             return jsonStr;
//         } catch (IOException e) {
//             e.printStackTrace();
//             return null;
//         }
//     }
//
//
//     public static void main(String[] args) {
//         String absolutePath = new File("").getAbsolutePath();
//         String fileName = "user.json";
//         String path = absolutePath + Constants.relativePath + "/" + fileName;
//         String s = readJsonFile(path);
//         System.out.println(path);
//         JSONObject jsonObj = JSON.parseObject(s);
//         JSONArray movies = jsonObj.getJSONArray("user");//构建JSONArray数组
//         for (Object movie : movies) {
//             JSONObject key = (JSONObject) movie;
//             String id = (String) key.get("id");
//             String account = (String) key.get("account");
//             String password = ((String) key.get("password"));
//             String hashPw = ((String) key.get("hash_pw"));
//             System.out.println();
//             System.out.println(id);
//             System.out.println(account);
//             System.out.println(password);
//             System.out.println(hashPw);
//         }
//     }
// }

