package list;

import java.util.ArrayList;
import java.util.List;

/**
 * list集合中元素有序（添加顺序和取出顺序一致），可重复
 * list集合每个元素都对应着索引，索引从0开始
 *
 * 常用方法：
 *  get(int index) 获取指定index位置的元素
 *  set(int index,Object obj) 设置指定index位置的元素为obj
 *  indexOf(Object obj) 返回obj在集合中首次出现的位置
 *  lastIndexOf(Object obj) 返回obj在集合中最后一次出现的位置
 *  subList(int fromIndex,int toIndex) 返回从fromIndex到toIndex位置的子集合，包括前面
 * */
public class list接口介绍 {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("tom");
        list.add("jack");
        list.add("roce");
        list.add("tom");
        System.out.println(list);
        list.get(3);

        int tom = list.indexOf("tom");
        int tom1 = list.lastIndexOf("tom");
        System.out.println(tom);
        System.out.println(tom1);

        list.set(0,"哈哈");
        System.out.println(list);
        List list1 = list.subList(0, 2);
        System.out.println(list1);
    }
}
