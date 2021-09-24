# 集合笔记

## Collection接口

![img_0.png](src/image/Collection.png)

1.Collection接口的子接口中：
~~~
 List：可重复 有序类
 Set：不可重复 无序类
~~~


2.Collection接口 常用方法

~~~
*   add: 添加
*   remove: 删除
*   contains: 查找元素是否存在
*   containsAll: 查找多个元素是否都存在
*   size: 元素个数
*   isEmpty: 是否未空
*   clear: 清空
*   addAll :添加多个元素
*   removeAll :删除多个元素

~~~

3.Iterator迭代器

~~~
* 迭代器执行原理
* Iterator iterator = coll.iterator();//得到一个集合迭代器
*
* while(iterator.hasNext()){ // hesNext() 判断是否还有下一个元素
*
*     iterator.next() // next() 下移一位，并将该元素返回
* }
*
* iterator迭代器遍历快捷键 itit
~~~

4.增强for

~~~
 增强for 就是简化版的Iterator迭代器，底层还是调用迭代器
~~~


### List接口

1.List接口介绍
~~~
 * list集合中元素有序（添加顺序和取出顺序一致），可重复
 * list集合每个元素都对应着索引，索引从0开始
~~~

2.常用方法
~~~
 *  get(int index) 获取指定index位置的元素
 *  set(int index,Object obj) 设置指定index位置的元素为obj
 *  indexOf(Object obj) 返回obj在集合中首次出现的位置
 *  lastIndexOf(Object obj) 返回obj在集合中最后一次出现的位置
 *  subList(int fromIndex,int toIndex) 返回从fromIndex到toIndex位置的子集合，包括前面
~~~

3.List接口练习
~~~
/**
 *  使用 list接口实现类添加三本书，并遍历
 *  要求：
 *      1.按价格排序，从低到高（冒泡排序）
 *
 * */
public class list接口练习 {
    public static void main(String[] args) {

        List list = new ArrayList();

        list.add(new Book("三国演义","罗贯中",50.0));
        list.add(new Book("红楼梦","曹雪芹",100.0));
        list.add(new Book("西游记","吴承恩",30.0));
        list.add(new Book("水浒传","施耐庵",60.0));

        for (Object o : list) {
            System.out.println(o);
        }

        sort(list);

        System.out.println("----------------排序后");
        for (Object o : list) {
            System.out.println(o);
        }


    }

    //冒泡排序，从低到高
    public static void sort(List list){
        int size = list.size();
        for (int i = 0; i <size -1; i++) {
            for (int j = 0; j < size -i -1; j++) {
                Book book = (Book) list.get(j);
                Book book1 =(Book) list.get(j + 1);
                if (book.getPrice() > book1.getPrice()){
                    list.set(j,book1);
                    list.set(j+1,book);
                }
            }
        }
    }
}
class Book {...}
~~~

4.ArrayList注意事项
~~~
1.ArrayList是由 数组 来实现数据存储的
2.ArrayList等同于Vector，ArrayList是线程不安全(执行效率高)；在多线程情况下，不建议使用ArrayList
~~~

5.ArrayList的底层操作机制和源码分析
~~~
1.ArrayList中维护了一个Object类型的数组elementData
2.当创建ArrayList对象时，如果使用的是无参构造器，则初始elementData的容量为0，第一次添加则扩容elementData为10，如需要再次扩容，则扩容elementData为1.5倍
3.如果使用的是指定大小的构造器，则初始elementData容量为指定大小，如果需要扩容，则直接扩容elementData的1.5倍
~~~

![img_0.png](src/image/ArrayList扩容机制.png)

## Map框架

![img_0.png](src/image/Map.png)