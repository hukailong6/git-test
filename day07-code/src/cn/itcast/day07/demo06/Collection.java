package cn.itcast.day07.demo06;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Collection {

    public static void main(String[] args) {
        Map map = new HashMap();
        Object put = map.put("a", "啦啦啦");
        System.out.println(put);
        map.put("b", "呜呜呜");

        Map hashMap = new ConcurrentHashMap<>();
        Map<Object, Object> synchronizedMap = Collections.synchronizedMap(HashMap);
        System.out.println("aa");
    }

}
