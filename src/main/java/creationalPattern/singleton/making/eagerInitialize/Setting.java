package creationalPattern.singleton.making.eagerInitialize;

public class Setting {

    private static final Setting INSTANCE = new Setting();

    static {
        System.out.println("instance - ready");
    }
    private Setting() {
        System.out.println("Setting constructor");
    }

    public static Setting getInstance() {
        System.out.println("Setting - getInstance()");
        return INSTANCE;
    }

    public static void main(String[] args) {
        System.out.println("hello");
        Setting.getInstance();
    }
}
