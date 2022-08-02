package creationalPattern.singleton.breaking.serialize;

import java.io.Serializable;

public class Setting implements Serializable {


    private Setting() {
    }

    private static class SettingHolder{
        private static final Setting INSTANCE = new Setting();

    }

    public static synchronized Setting getInstance() {

        return SettingHolder.INSTANCE;
    }

    protected Object readResolve() {
        return getInstance();
    }
}
