package ch14_5;
/*<[자바의 정석 - 기초편] ch14-5,6 함수형인터페이스>
 * https://youtu.be/0Sp9eFRV8gE?si=yj1jzYL8BOGbLxmV
 *
 * 함수형 인터페이스: 단 하나의 추상메서드만 선언된 인터페이스
 * => 함수형 인터페이스 타입의 참조변수로 람다식 사용 가능!
 * */

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FunctionalInterfaceClass {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc", "def", "aaa", "ghi", "bbb");
/*        //익명 객체를 람다식으로 대체하기 "전"
        Collections.sort(list, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);//내림차순
            }
        });*/
        //익명 객체를 람다식으로 대체한 "후"
        Collections.sort(list, (o1, o2) -> o2.compareTo(o1));//내림차순

        System.out.println(Arrays.toString(list.toArray()));//hi
    }
}