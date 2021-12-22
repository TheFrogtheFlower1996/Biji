package list;

import java.util.*;

public class list遍历方式 {
    public static void main(String[] args) {

//        List list = new ArrayList();
//        List list = new Vector();
        List list = new LinkedList();
        list.add("刘备");
        list.add("关羽");
        list.add("张飞");
        System.out.println(list);
        System.out.println("------------");

        //Iterator迭代器
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }
        System.out.println("------------");


        //增强for
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println("------------");


        //普通for
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
