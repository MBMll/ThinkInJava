package io;

import java.io.*;

/**
 * Created by xlc on 2018/3/20.
 */
public class BasicFileOutput {
    static String file = "BasicFileOutput.out";

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(
                new StringReader(
                        BufferedInputFile.read("BasicFileOutput.java")));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
        int lineCount = 1;
        String s;

        while ((s = in.readLine()) != null)
            out.println(lineCount++ + ": " + s);

        out.close();
        System.out.println(BufferedInputFile.read(file));
    }
}
