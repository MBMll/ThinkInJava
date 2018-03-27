package io.xfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**<i>985</i>
 * Created by xlc on 2018/3/27.
 */
public class ThawAlien {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(
                        new File( "..","X.file")));
        Object mystery = in.readObject();
        System.out.println(mystery.getClass());
    }
}
