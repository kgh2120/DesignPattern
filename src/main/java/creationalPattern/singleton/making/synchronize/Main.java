package creationalPattern.singleton.making.synchronize;


/**
 * 싱글톤을 가장 쉽게 적용한 경우
 * static method로 인스턴스 값을 받아온다.
 * 같은 객체를 받아오기 때문에 true가 반환된다.
 * 하지만 멀티쓰레드 환경에서는 getInstance에서 서로 다른 객체가 생성될 수 있어서
 * 쓰레드 환경에 안전하지 못함.
 */

public class Main {
    public static void main(String[] args) {
        Setting s1 = Setting.getInstance();
        Setting s2 = Setting.getInstance();

        System.out.println(s1 == s2); // true
    }
}
