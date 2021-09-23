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
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println(list);
    }
}
