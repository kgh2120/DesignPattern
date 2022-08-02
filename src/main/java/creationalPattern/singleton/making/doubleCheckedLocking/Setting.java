package creationalPattern.singleton.making.doubleCheckedLocking;

public class Setting {

    private static volatile Setting instance;

    private Setting(){}

    public static Setting getInstance() {
        if(instance == null)
            synchronized (Setting.class){
                if(instance == null)
                    instance = new Setting();
            }
        return instance;
    }

}
