package ch20_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
class User {
    private String username;
    private String password;
    private String email;
    private String name;
    private String age;
}

public class JSON2 {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();

        // 사용할 변수 선언 -> Json 데이터는 자료형이 String입니다.
        String userJson = null;
        String studentJSon = null;

        // Java Object -> json으로의 변환 사례
        // user1 객체를 생성하고 "kim1", "9876", "a@test.com", "김일", "20"로 입력하시오.
        User user1 = new User("kim1", "9876", "a@test.com", "김일", "20");

        // Gson을 사용하여 Java 객체 -> JSON으로 변환
        System.out.println("json 형태로 변환 : " + gson.toJson(user1));
        // 객체 그대로 출력하면
        System.out.println("java 객체 형태로 출력 : " + user1);
        // GsonBuilder를 사용하여 prettyPrinting 적용 후 JSON으로 변환
        System.out.println("prettyPrinting 적용 후 출력 : \n" + gsonBuilder.toJson(user1));

        // gsonBuilder를 통한 결과값을 userJson에 대입
        userJson = gsonBuilder.toJson(user1); // Json 데이터가 String인게 증명됩니다.

        // JsonObject -> json으로의 변환 사례
        // JSonObject를 활용하여 studentCode 2025001 / studentName 김이 / studentYear 2 / score 96.7인 객체를 생성하시오.
        JsonObject student = new JsonObject();
        student.addProperty("studentCode", "2025001");
        student.addProperty("studentName", "김이");
        student.addProperty("studentYear", "2");
        student.addProperty("score", "96.7");

        // gsonBuilder를 활용하여 JsonObject 객체를 json으로 변환
        studentJSon = gsonBuilder.toJson(student);

        // 해당 데이터를 studentJson에 대입하고, 출력하시오.
        System.out.println("Student JSON: " + studentJSon);
    }
}