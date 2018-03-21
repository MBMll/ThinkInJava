package net.mindview.util;

import java.io.File;

/**
 * Created by xlc on 2018/3/19.
 */
public class Print {

    public static void print(String s) {
        System.out.println(s);
    }

    public static void print(File file) {
        System.out.println(file.getName());
    }

    public static void printnb(String csName) {
        System.out.print(csName);
    }
}
