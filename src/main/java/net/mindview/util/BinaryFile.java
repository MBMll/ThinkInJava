package net.mindview.util;

import java.io.*;

/**
 * Created by xlc on 2018/3/20.
 */
public class BinaryFile {
    public static byte[] read(File bFile) throws IOException {
        BufferedInputStream bf = new BufferedInputStream(
                new FileInputStream(bFile));
        try {
            byte[] data = new byte[bf.available()];
            bf.read(data);
            System.out.println("没有异常");
            return data;
        } finally {
            bf.close();
            System.out.println("最终执行");
        }
    }

    public static byte[] read(String bFile) throws IOException {
        return read(new File(bFile).getAbsoluteFile());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(
                new InputStreamReader(
                        new ByteArrayInputStream(
                                read("BinaryFile.java"))));
        String s;
        while ((s = bf.readLine()) != null)
            System.out.println(s);
    }
}
