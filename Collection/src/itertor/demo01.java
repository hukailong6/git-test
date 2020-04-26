package itertor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class demo01 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");
        coll.add("eee");
        Iterator<String> it = coll.iterator();
        while (it.hasNext()) {
            String e = it.next();
            System.out.println(e);
        }

        for (String s : coll) {
            System.out.println(s);
            System.out.println(s);
            System.out.println(s);
            System.out.println(s);
        }

    }
}
