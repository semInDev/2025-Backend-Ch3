package p94;

import java.util.Optional;

public class OptionalEx3 {
    private static Optional<String> getSomething() {
        return Optional.ofNullable("public static void");// 값을 포함한 Optional 리턴
    }
    public static void main(String[] args) {
        Optional<String> isThisNulll = getSomething();
        
        // Optional을 제대로 사용하는 코드
        isThisNulll.ifPresent(str -> System.out.println(str.toUpperCase()));

        // 아래 코드는 안티 패턴 코드
        // : 디자인 패턴 = 재사용하기 좋고, 가독성 있고, 효율적인 코드
        // : <-> 안티패턴 =  재사용, 가독성, 효율성이 떨어지는 코드
        if(isThisNulll.isPresent()){
            System.out.println(isThisNulll.get().toUpperCase());
        }
    }
}
