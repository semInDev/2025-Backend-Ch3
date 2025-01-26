package p94;

import java.util.Optional;

public class OptionalEx2 {
    private static Optional<String> getSomething() {
        return Optional.empty();// null이 아닌 비어있는 Optional을 반환함
    }
    public static void main(String[] args) {
        Optional<String> isThisNulll = getSomething();

        isThisNulll.ifPresent(str -> System.out.println(str.toUpperCase()));
    }
}
