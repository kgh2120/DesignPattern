package creationalPattern.singleton.making.staticInner;

public class Main {
    public static void main(String[] args) {

        Setting.getInstance();
        Setting.getInstance();
        Setting.getInstance();
    }
}
