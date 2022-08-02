package creationalPattern.singleton.breaking.serialize;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Throwable{

        Setting setting = Setting.getInstance();
        Setting setting1 = null;
        try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream("setting.obj"))){
            out.writeObject(setting);

        }
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("setting.obj"))) {
            setting1 = (Setting) in.readObject();
        }
        System.out.println(setting == setting1); // protected readResolve()를 설정하지 않으면 false가 발생한다.

        try (Scanner sc = new Scanner(System.in)) {
            int i = sc.nextInt();
        }




    }
}
