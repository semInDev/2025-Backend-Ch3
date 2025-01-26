package p85;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LamdaEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("public");
        list.add("static");
        list.add("void");

        //익명클래스(이름이 없는 클래스) 이용
        list.sort(new Comparator<String>(){//정렬 기준으로 익명클래스
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);//오름차순
            }
        });
        System.out.println(list.toString());

        //람다 표현식 이용: 클래스 선언, 메서드 선언을 생략하고 "익명함수"를 사용
        list.sort((Comparator<String>)(o1,o2)->(o2.compareTo(o1)));
        System.out.println(list.toString());

    }
}
