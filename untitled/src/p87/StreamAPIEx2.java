package p87;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIEx2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 1);
        List<Integer> evenList = new ArrayList<>();

        //stream 사용 X
        for(int num : list){
            if(num % 2 == 0){
                evenList.add(num);
            }
        }
        for(int num : evenList){
            System.out.println(num);
        }

        //stream 사용 O
        evenList = list
                .stream()
                .filter(num -> num%2==0)
                .collect(Collectors.toList());
        evenList
                .stream()
                .forEach(num -> System.out.println(num));

    }
}
