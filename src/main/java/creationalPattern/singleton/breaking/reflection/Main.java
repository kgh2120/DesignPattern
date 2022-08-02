package creationalPattern.singleton.breaking.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Constructor<Setting> c1 = Setting.class.getDeclaredConstructor();
        c1.setAccessible(true);
        Setting s1 = c1.newInstance();
        Setting s2 = Setting.getInstance();

        System.out.println(s1 == s2); // false

    }
}
