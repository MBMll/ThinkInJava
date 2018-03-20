package io;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

/**
 * Created by xlc on 2018/3/20.
 */
public class FormattedMemoryInput {
    public static void main(String[] args) throws IOException {
        try {
            DataInputStream in = new DataInputStream(
                    new ByteArrayInputStream(
                            BufferedInputFile
                                    .read("FormattedMemoryInput.java")
                                    .getBytes()));
            while (true)
                System.out.println((char) in.readByte());
        } catch (EOFException e) {
            System.out.flush();
            try {
                Thread.sleep(0);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            } finally {
                System.err.println("End of stream");
            }
        }
    }
}
