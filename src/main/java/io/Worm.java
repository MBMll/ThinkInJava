package io;

import org.junit.Test;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static net.mindview.util.Print.print;

/**
 * <i>982</i>
 * Created by xlc on 2018/3/27.
 */
class Data implements Serializable {
    private int n;

    public Data(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return Integer.toString(n);
    }
}

public class Worm implements Serializable {
    private static Random rand = new Random(47);
    private Data[] d = {
            new Data(rand.nextInt(10))
            , new Data(rand.nextInt(10))
            , new Data(rand.nextInt(10))
    };
    private Worm next;
    private char c;

    public Worm(int i, char x) {
        print("Worm constrctor: " + i);
        c = x;
        if (--i > 0)
            next = new Worm(i, (char) (x + 1));
    }

    public Worm() {
        print("Default constructor");
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(":");
        result.append(c);
        result.append("(");
        for (Data dat : d)
            result.append(dat);
        result.append(")");
        if (next != null)
            result.append(next);
        return result.toString();
    }

    @Test
    public static void test(String[] args) throws IOException, ClassNotFoundException {
        Worm w = new Worm(6, 'a');
        print("w = " + w);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("worm.out"));
        out.writeObject("Worm storage\n");
        out.writeObject(w);
        out.close();        //Also flushes output
        print(w.hashCode());

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("worm.out"));
        String s = (String) in.readObject();
        Worm worm = (Worm) in.readObject();
        print(s + "w2 = " + worm);
        print(worm.hashCode());
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ObjectOutputStream out2 = new ObjectOutputStream(bout);
        out2.writeObject("Worm storage\n");
        out2.writeObject(w);
        out2.flush();
        ObjectInputStream in2 = new ObjectInputStream(new ByteArrayInputStream(bout.toByteArray()));
        s = (String) in2.readObject();
        Worm w3 = (Worm) in2.readObject();
        print(s + "w3 = " + w3);
        print(w3.hashCode());


    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Map<Integer, Data> m1 = new HashMap<Integer, Data>();
        Map<Integer, Data> m2 = new HashMap<Integer, Data>();

        Data d = new Data(1);
        m1.put(1, d);
        m2.put(1, d);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("map.out"));
        out.writeObject("map storage\n");
        out.writeObject(m1);
        out.writeObject(m2);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("map.out"));
        String s = (String) in.readObject();
        Map<Integer, Data> mo1 = (Map<Integer, Data>) in.readObject();
        Map<Integer, Data> mo2 = (Map<Integer, Data>) in.readObject();
        System.out.println(mo1.get(1));
        System.out.println(mo2.get(1));
        System.out.println(mo1.get(1)==mo2.get(1));

    }
}
