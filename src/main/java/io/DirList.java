package io;

import java.io.File;
import java.util.Arrays;

/**
 * Display a directory listing using regular expressions.
 * Created by xlc on 2018/3/19.
 */
public class DirList {
    public static void main(String[] args) {
        File path = new File(".");
        String[] list;
        System.out.println(Arrays.asList(args));
        if (args.length == 0)
            list = path.list();
        else
            list = path.list(new DirFilter(args[0]));
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String dirItem : list) {
            System.out.println(dirItem);
        }
    }
}
