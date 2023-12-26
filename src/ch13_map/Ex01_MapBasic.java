package ch13_map;

import java.util.HashMap;
import java.util.Map;

public class Ex01_MapBasic {
    public static void main(String[] args) {
        //Key 타입은(int) , value : String
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1,"안녕");
        map1.put(2,"Hello");
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
        for(Integer i : map1.keySet()){
            System.out.println("i = " + i);
        }
        for(String i : map1.values()){
            System.out.println("i = " + i);
        }
    }
}
