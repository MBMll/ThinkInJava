package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * 缓冲输入文件
 * Created by xlc on 2018/3/20.
 */
public class BufferedInputFile {

    public static String read(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;
        StringBuilder sb = new StringBuilder();
        while ((s = in.readLine()) != null)
            sb.append(s + "\n");
        in.close();
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        File file = new File(".");
        System.out.println(Arrays.asList(file.list()));
//        需要将working directory改成当前文件路径./io/
        System.out.println(read("BufferedInputFile.java"));
    }
}
