package p87;

import java.util.ArrayList;
import java.util.List;

public class StreamAPIEx1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        //for문 이용
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        //stream이용
        list
                .stream()
                .forEach(str -> System.out.println(str));
                //.forEach(System.out::println);
    }
}
