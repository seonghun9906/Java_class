package ch13_map;

import java.util.HashMap;
import java.util.Map;

public class Ex01_MapBasic {
    public static void main(String[] args) {
        //Key 타입은(int) , value : String
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "안녕");
        map1.put(2, "Hello");
//        map1.put(3,100);  // Value 타입 불일치
//        map1.put("4", "안녕하세요"); // Key 타입 불일치

        //key가 1인 데이터
        System.out.println(map1.get(1));
        String s1 = map1.get(1);
        System.out.println("s1 = " + s1);
        map1.put(100, "ㅎㅎㅎㅎ"); // key 값을 마음대로 넣어도 되지만 일관성이 없어서 나중에 찾기 어려움.
        // 동일한 키에 다른 데이터를 넣는다면
        map1.put(1, "안녕하십니까");
        System.out.println(map1.get(1));

        //반복문으로 접근
        for (Integer i : map1.keySet()) {
            System.out.println("i = " + i);
        }
        for (String i : map1.values()) {
            System.out.println("i = " + i);
        }
            //key : String, value : String
            Map<String, String> map2 = new HashMap<>();
            map2.put("가", "안녕");
            map2.put("나", "ㅎㅎㅎ");
            map2.put("다", "ㅋㅋㅋ");
            System.out.println(map2.get("가"));

            //반복문
            for (String s : map2.keySet()) {
                System.out.println("s = " + s);
            }
            for (String s : map2.values()) {
                System.out.println("s = " + s);
            }



        Map<Long, String> map3 = new HashMap<>();
        String ss1 = map3.put(1L, "안녕");
        System.out.println("ss1 = " + ss1); //null
        String ss2 = map3.put(2L, "hello");
        System.out.println("ss2 = " + ss2); //null
        String ss3 = map3.put(1L, "안녕하세요");
        System.out.println("ss3 = " + ss3); //안녕

        //처음 저장값은 null이 나옴
        //다시 입력을 한다면 이전값이 나옴.

    }
}
