package io;

import java.io.File;

/**
 * Created by xlc on 2018/3/19.
 */
public class MakeDirectories {
    private static void usage() {
        System.err.println(
                "Usage:MakeDirectories path1 ...\n" +
                        "Creates each path\n" +
                        "Usage:MakeDirectories =d path1 ...\n" +
                        "Deletes each path\n" +
                        "Usages:MakeDirectories =r path1 path2\n" +
                        "Renames from path1 to path2");

        System.exit(1);
    }

    private static void fileData(File file) {
        System.out.println(
                "Absolute path: " + file.getAbsolutePath() +
                        "\n Can read: " + file.canRead() +
                        "\n Can write: " + file.canWrite() +
                        "\n getName: " + file.getName() +
                        "\n getParent: " + file.getPath() +
                        "\n getPath: " + file.getPath() +
                        "\n length: " + file.length() +
                        "\n lastModified: " + file.lastModified());

        if (file.isFile())
            System.out.println("It's a file");
        else if (file.isDirectory())
            System.out.println("It's a directory");
    }

    public static void main(String[] args) {
        if (args.length < 1) usage();
        if ("-r".equals(args[0])) {
            if (args.length != 3) usage();

            File old = new File(args[1]),
                    rname = new File(args[2]);
            old.renameTo(rname);
            fileData(old);
            fileData(rname);
            return;
        }
        int count = 0;
        boolean del = false;
        if ("-d".equals(args[0])) {
            count++;
            del = true;
        }
        count--;
        while (++count < args.length) {
            File f = new File(args[count]);
            if (f.exists()) {
                System.out.println(f + " exists");
                if (del) {
                    System.out.println("deleting..." + f);
                    f.delete();
                }
            } else {
                if (!del) {
                    f.mkdirs();
                    System.out.println("created " + f);
                }
            }
            fileData(f);
        }
    }
}
