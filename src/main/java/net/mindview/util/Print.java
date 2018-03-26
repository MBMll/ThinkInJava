package net.mindview.util;

import java.io.PrintStream;

/**
 * Created by xlc on 2018/3/19.
 */
public class Print {
    public static void print() {
        System.out.println();
    }


    public static void print(Object object) {
        System.out.println(object);
    }

    public static void printnb(String csName) {
        System.out.print(csName.trim());
    }

    public static PrintStream printf(String format, Object... args) {
        return System.out.printf(format, args);
    }
}
