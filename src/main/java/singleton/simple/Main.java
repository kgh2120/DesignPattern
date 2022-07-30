package singleton.before;


/**
 * 싱글톤을 적용하기 이전 상황
 * new 를 사용해서 인스턴스를 생성하기 때문에,
 * 서로 다른 인스턴스가 생성이된다.
 */

public class Main {
    public static void main(String[] args) {
        Setting s1 = new Setting();
        Setting s2 = new Setting();

        System.out.println(s1 == s2);
    }
}
