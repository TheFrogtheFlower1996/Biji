package list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCRUD {
    public static void main(String[] args) {


        LinkedList linkedList = new LinkedList();

        linkedList.add(12);
        linkedList.add(16);

//        linkedList.remove();

        //LinkedList遍历 推荐使用迭代器
        // 迭代器
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
        //增强for
        for (Object o : linkedList) {
            System.out.println(o);
        }
        //普通for
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }


    }
}
