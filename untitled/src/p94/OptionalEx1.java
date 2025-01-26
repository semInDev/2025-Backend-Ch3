package p94;

public class OptionalEx1 {
    private static String getSomething() {
        return null;
    }
    public static void main(String[] args) {
        String isThisNulll = getSomething();

        // 이렇게 어떤 메서드를 호출하여 값을 반환받았다면
        // 해당 값이 null이 아닌지 확인하고 다음 작업을 진행해야했다.
        //System.out.println(isThisNulll.toUpperCase());// NullPointerException 에러 발생
        if(isThisNulll != null) {
            System.out.println(isThisNulll.toUpperCase());
        }
    }
}
