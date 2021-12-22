package Collection;
/**
* 一. Collection接口实现特点：public interface Collection<E> extends Iterable<E>
*
*   1.Collection实现类中，
*       List 是可重复 有序类
*       Set  是不可重复 无序类
*
* 二. Collection接口常用方法
*
*   add: 添加
*   remove: 删除
*   contains: 查找元素是否存在
*   containsAll: 查找多个元素是否都存在
*   size: 元素个数
*   isEmpty: 是否未空
*   clear: 清空
*   addAll :添加多个元素
*   removeAll :删除多个元素
*
* */

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class collection常用方法 {
    public static void main(String[] args) {



        List list = new ArrayList();
        list.add("zhangsan");
        list.add(2);
        list.add(true);
        System.out.println(list);

        //删除某个特定值，返回值为boolean类型
//        boolean remove = list.remove("zhangsan");//true

        //remove 删除某个索引处的值，返回该值
//        Object remove1 = list.remove(0);//zhangsan

        //contains 查找元素是否存在，返回值为boolean类型
//        boolean zhangsan = list.contains("zhangsan1");/false

        //size 返回集合的个数
//        int size = list.size();//3

        //isEmpty 判断是否为空
//        boolean empty = list.isEmpty();//false

        //clear 清空
//        list.clear();//list=[]

        //addAll 添加多个元素
        List list1 = new ArrayList();
        list1.add("刘备");
        list1.add("张飞");
        list1.add("关羽");
        list.addAll(list1);
//        list.addAll(2,list1);

        //containsAll 查找多个元素是否存在
//        boolean b = list.containsAll(list1);// true

        //removeAll 删除多个元素
        boolean b = list.removeAll(list1);// true
        System.out.println(b);
        System.out.println(list);


    }
}
