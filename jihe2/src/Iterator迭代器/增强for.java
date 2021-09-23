package Iterator迭代器;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 增强for循环就是简化版的Iterator迭代器
 *
 *
 *
 * */
public class 增强for {
    public static void main(String[] args) {
        Collection list = new ArrayList();
        list.add(new Book("qianbi","x",5.0));
        list.add(new Book("xiaodao","a",7.0));
        list.add(new Book("xiangpi","c",9.5));

        System.out.println(list);
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
