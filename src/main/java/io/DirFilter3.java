package io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/**
 * Created by xlc on 2018/3/19.
 */
public class DirFilter3 {
    public static void main(final String[] args) {
        final File path = new File(".");
        String[] list;
        list = args.length == 0 ?
                path.list() : path.list(new FilenameFilter() {
            private Pattern pattern = Pattern.compile(args[0]);

            public boolean accept(File dir, String name) {
                return pattern.matcher(name).matches();
            }
        });
    }
}
