package io;

import java.io.IOException;
import java.io.StringReader;

/**
 * Created by xlc on 2018/3/20.
 */
public class MemoryInput {
    public static void main(String[] args) throws IOException {
        StringReader in = new StringReader(BufferedInputFile.read("MemoryInput.java"));
        int c;
        while ((c = in.read()) != -1)
            System.out.println((char) c);
    }
}
