package io;

import net.mindview.util.Directory;
import net.mindview.util.PPrint;

import java.io.File;

import static net.mindview.util.Print.print;


/**
 * Created by xlc on 2018/3/19.
 */
public class DirectoryDemo {
    public static void main(String[] args) {
        PPrint.pprint(Directory.walk(".").dirs);
        for (File file : Directory.local(".", "T.*"))
            print(file);
        print("-----------------------");
        for (File file : Directory.walk(".", "T.*\\.java"))
            print(file);
        print("=======================");
        for (File file : Directory.walk(".", "[Zz].*\\.class"))
            print(file);
    }

}
