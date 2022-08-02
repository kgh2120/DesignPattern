package creationalPattern.singleton.breaking.reflection;

public class Setting {


    private Setting() {
    }

    private static class SettingHolder{
        private static final Setting INSTANCE = new Setting();

    }

    public static synchronized Setting getInstance() {

        return SettingHolder.INSTANCE;
    }
}
