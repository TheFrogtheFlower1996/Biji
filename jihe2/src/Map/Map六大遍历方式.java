package Map;

import java.util.*;

public class Map六大遍历方式 {
    public static void main(String[] args) {

        HashMap map = new HashMap();
        map.put("邓超","孙俪");
        map.put("张三","李四");
        map.put("黄晓明","李颖");
        map.put("胡歌",null);
        map.put(null,"护士");

        // keySet获取key集合
        Set set = map.keySet();

        // 1 增强for
        for (Object obj : set) {
            System.out.println(obj);
        }
        // 2 迭代器 迭代key
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

        //values获取value集合
        Collection values = map.values();

        // 3 values()取出值集合
        for (Object value : values) {
            System.out.println(value);
        }

        // 4 迭代器 迭代值
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object next = iterator1.next();
            System.out.println(next);
        }

        // 5 EntrySet
        Set set1 = map.entrySet();

        for (Object o : set1) {
            //向下转型 Object 转 Entry
            Map.Entry o1 = (Map.Entry) o;
            Object key = o1.getKey();
            Object value = o1.getValue();
            System.out.println(key +"-" +value);
        }
        // 6 迭代器
        Iterator iterator2 = set1.iterator();
        while (iterator2.hasNext()) {

        }
    }
}
