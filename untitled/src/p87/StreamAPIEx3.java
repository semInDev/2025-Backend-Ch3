package p87;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIEx3 {
    public static void main(String[] args) {
        //distinct
        List<Integer> list = Arrays.asList(1,1,1,1,2,2,2,2,3,4,4,4);
        list.stream()
                .distinct()
                .forEach(num -> System.out.println(num));

        //map: 컬렉션 요소들에 특정 연산을 한 후 새로운 컬렉션으로 리턴
        List<String> lowerList = Arrays.asList("public", "static", "void");
        List<String> upperList = lowerList.stream()
                .map(str -> str.toUpperCase())
                .toList();
        upperList.stream()
                .forEach(str -> System.out.println(str));
    }
}
