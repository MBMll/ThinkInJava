package tech.aulor.test;

import org.junit.Test;

/**
 * @Author xlc
 * @Description
 * @Date 2018/5/11 16:43
 */

public class JDK8 {
    @Test
    public void testThread() {
        String s = new String();
        synchronized (s) {
            try {
                s.wait(1L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
