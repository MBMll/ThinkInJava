package io;

import net.mindview.util.OSExcute;

/**
 * Created by xlc on 2018/3/21.
 */
public class OSExecuteDemo {
    public static void main(String[] args) {
//        反汇编要带包名, working directory 要在target/classes下
        OSExcute.command("javap io.OSExecuteDemo");
    }

}
