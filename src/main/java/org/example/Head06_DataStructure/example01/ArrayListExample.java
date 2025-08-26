package org.example.Head06_DataStructure.example01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        //ArrayList - 내부적으로 object[] 배열 사용
        List<String> list = new ArrayList<>();

        //배열 끝에 추가, O(1)
        list.add("Apple");
        list.add("Banana");
        System.out.println(list.get(1));

        // 중간 삭제 -> 뒤의 요소를 다 한칸씩 앞으로 이동 O(n)
        list.remove(0);
        System.out.println(list);
    }
}
