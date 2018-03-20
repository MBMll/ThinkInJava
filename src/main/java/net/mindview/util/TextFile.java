package net.mindview.util;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

/**
 * Created by xlc on 2018/3/20.
 */
public class TextFile extends ArrayList<String> {
    public static String read(String fileName) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader in = new BufferedReader(
                    new FileReader(
                            new File(fileName)));
            try {
                String s;
                while ((s = in.readLine()) != null)
                    sb.append(s).append("\n");
            } finally {
                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }

    public static void write(String filename, String text) {
        try {
            PrintWriter out = new PrintWriter(
                    new File(filename).getAbsoluteFile());
            try {
                out.print(text);
            } finally {
                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public TextFile(String fileName, String splitter) {
        super(Arrays
                .asList(read(fileName)
                        .split(splitter)));
        if ("".equals(get(0))) remove(0);
    }

    public TextFile(String fileName) {
        this(fileName, "\n");
    }

    public void write(String fileName) {
        try {
            PrintWriter out = new PrintWriter(
                    new File(fileName).getAbsoluteFile());
            try {
                for (String item : this)
                    out.print(item);
            } finally {
                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String file = read("TextFile.java");
        write("test.txt", file);
        TextFile text = new TextFile("test.txt");
        text.write("test2.txt");
        TreeSet<String> words = new TreeSet<String>(
                new TextFile("TextFile.java",
                        "\\W+"));
        System.out.println(words.headSet("a"));
    }
}