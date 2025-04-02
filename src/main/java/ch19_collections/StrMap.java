package ch19_collections;

import java.util.*;

public class StrMap {
    public static void main(String[] args) {
        Map<String, String> strMap = new HashMap<>();

        // Map에 key - value 쌍 삽입 -> .put(키, 값);
        strMap.put("kor2025001", "강수림");
        strMap.put("kor2025002", "기준성");
        strMap.put("kor2025003", "김미진");
        strMap.put("kor2025004", "김준식");
        strMap.put("kor2025005", "문성진");
        strMap.put("kor2025006", "심민호");
        strMap.put("kor2025007", "양지은");
        strMap.put("kor2025008", "유지현");
        strMap.put("kor2025009", "윤현지");
        strMap.put("kor2025010", "이동규");
        strMap.put("kor2025011", "이예성");
        strMap.put("kor2025012", "이정화");
        strMap.put("kor2025013", "전용남");
        strMap.put("kor2025014", "채수원");
        strMap.put("kor2025015", "한영진");
        strMap.put("kor2025015", "Jake");
        // Map의 출력
        System.out.println(strMap);

        // Map의 특징 중 하나로 하나의 key에는 하나의 value만 존재할 수 있기 때문에
        // 만약에 key가 겹친다면 가장 최근의 value로 덮어쓰기됨.

        // 특정 키의 값 조회
        System.out.println(strMap.get("kor2025001"));   // 강수림 출력 -> 즉, value만 출력됨

        // 특정 키의 값 수정 # 1 -> .put()을 통해서 덮어쓰기
        strMap.put("kor2025001", "김일");
        System.out.println(strMap.get("kor2025001"));

        // 특정 키의 값 수정 # 2 -> .replace()
        strMap.replace("kor2025002", "김이");
        System.out.println(strMap.get("kor2025002"));

        // 특정 키의 존재 여부 -> containsKey(); -> boolean
        boolean searchKeyFlag1 = strMap.containsKey("kor2025016");
        System.out.println("kor2025016 해당 키 존재 여부 : " + searchKeyFlag1);

        // 특정 값의 존재 여부 -> containsValue(); -> boolean
        boolean searchValueFlag1 = strMap.containsValue("김이");
        System.out.println("김이 value 존재 여부 : " + searchValueFlag1);

        // Map의 엔트리(Key-Value 쌍을 통칭한 용어)로부터 Set 생성
        Set<Map.Entry<String, String>> entrySet1 = new HashSet<>();    // 비어있는 set 생성
        Set<Map.Entry<String, String>> entrySet2 = strMap.entrySet();    // 비어있는 set 생성
        System.out.println(entrySet1);
        System.out.println(entrySet2);
        //[kor2025008=유지현, kor2025007=양지은, kor2025009=윤현지, kor2025004=김준식, kor2025015=Jake, kor2025003=김미진, kor2025014=채수원, kor2025006=심민호, kor2025005=문성진, kor2025011=이예성, kor2025010=이동규, kor2025002=김이, kor2025013=전용남, kor2025001=김일, kor2025012=이정화]
        // , 를 기준으로 element 개수가 나뉜다는 점을 고려했을 때
        // 'key=value'가 하나의 set element가 된다는 점을 확인할 수 있음.

        List<Map.Entry<String, String>> entryList = new ArrayList<>();  //비어있는 List 선언
        entryList.addAll(entrySet2);        // 바로 Map -> List로는 불가능하고, Set을 경유해야함.
        System.out.println(entryList);

        // Key Set 출력 -> strMap 제네릭의 첫 번째 매개변수인 key에 해당하는 자료형을 넣어야 함.
        Set<String> keySet = strMap.keySet();
        System.out.println(keySet);

        // Value Set 출력 -> strMap 제네릭의 두 번째 매개변수인 value에 해당하는 자료형을 넣어야 함.

        // key는 중복이 없는데 value는 중복이 있을 수 있어서 set으로 direct 생성 불가능
        Collection<String> values = strMap.values();
        System.out.println(values);
        // key는 중복이 불가능하기 때문에 Set을 쓰는데,
        // value는 중복 허용이 되기 때문에 Set을 썼을 경우 중복 제거로 인해
        // 키의 개수와 값의 개수가 달라지게 될 위험성이 있어 Collection을 사용함(Collections가 아닙니다)
    }
}