package io;

import java.io.PrintWriter;

/**
 * Created by xlc on 2018/3/21.
 */
public class ChangeSystemOut {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out, true);
        out.println("Hello World");
    }
}
