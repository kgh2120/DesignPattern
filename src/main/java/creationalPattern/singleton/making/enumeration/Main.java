package creationalPattern.singleton.making.enumeration;

public class Main {
    public static void main(String[] args) {
        Setting s1 = Setting.INSTANCE;
        Setting s2 = Setting.INSTANCE;
        System.out.println(s1==s2); //true

    }
}
