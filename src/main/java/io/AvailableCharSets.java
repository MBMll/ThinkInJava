package io;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.SortedMap;
import static net.mindview.util.Print.*;
/**
 * <i>951</i>
 * Created by xlc on 2018/3/21.
 */
public class AvailableCharSets {
    public static void main(String[] args) {
        SortedMap<String, Charset> charSets = Charset.availableCharsets();
        Iterator<String> iterator = charSets.keySet().iterator();
        while (iterator.hasNext()) {
            String csName = iterator.next();
            printnb(csName);
        }
    }

}
