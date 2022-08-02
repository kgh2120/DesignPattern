package creationalPattern.singleton.making.staticInner;

public class Setting {


    private Setting() {
        System.out.println("Setting 생성자 호출");
    }

    private static class SettingHolder{
        private static final Setting INSTANCE = new Setting();
        static{
            System.out.println("SettingHolder - init");
        }
    }

    public static synchronized Setting getInstance() {
        System.out.println("Setting -getInstance()");
        return SettingHolder.INSTANCE;
    }
}
