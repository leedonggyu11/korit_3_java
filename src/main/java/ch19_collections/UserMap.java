package ch19_collections;

import java.util.HashMap;
import java.util.Map;

public class UserMap {
    public static void main(String[] args) {
        Map<String, String> userMap = new HashMap<>();

        // username : 1
        // password : 1234
        // email : c@test.com
        // name : 김일 에 해당하는 Map을 만드시오.

        userMap.put("username", "1");
        userMap.put("password", "1234");
        userMap.put("email", "c@test.com");
        userMap.put("name", "김일");

        System.out.println(userMap);
    }
}