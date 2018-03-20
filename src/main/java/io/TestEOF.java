package io;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * <p>格式化的内存输入</p>
 * <p>Testing for end of file while reading a byte at a time .</p>
 * Created by xlc on 2018/3/20.
 */
public class TestEOF {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream("TestEOF.java")));
        while (in.available() > 0)
            System.out.println((char) in.readByte());
    }
}
