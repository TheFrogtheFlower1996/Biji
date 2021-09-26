# 集合笔记

## Collection接口

![img_0.png](src/image/Collection.png)

Collection接口的子接口中
~~~
 List：可重复 有序
 Set：不可重复 无序
~~~

Collection接口 常用方法

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

Iterator迭代器

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

增强for

~~~
 增强for 就是简化版的Iterator迭代器，底层还是调用迭代器
~~~


## List接口

List接口介绍
~~~
 * list集合中元素有序（添加顺序和取出顺序一致），可重复
 * list集合每个元素都对应着索引，索引从0开始
~~~

常用方法
~~~
 *  get(int index) 获取指定index位置的元素
 *  set(int index,Object obj) 设置指定index位置的元素为obj
 *  indexOf(Object obj) 返回obj在集合中首次出现的位置
 *  lastIndexOf(Object obj) 返回obj在集合中最后一次出现的位置
 *  subList(int fromIndex,int toIndex) 返回从fromIndex到toIndex位置的子集合，包括前面
~~~

List接口练习
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

## ArrayList注意事项

~~~
1.ArrayList是由 数组 来实现数据存储的
2.ArrayList等同于Vector，ArrayList是线程不安全(执行效率高)；在多线程情况下，不建议使用ArrayList
~~~

ArrayList的底层操作机制和源码分析
~~~
1.ArrayList中维护了一个Object类型的数组elementData
2.当创建ArrayList对象时，如果使用的是无参构造器，则初始elementData的容量为0，第一次添加则扩容elementData为10，如需要再次扩容，则扩容elementData为1.5倍
3.如果使用的是指定大小的构造器，则初始elementData容量为指定大小，如果需要扩容，则直接扩容elementData的1.5倍
~~~

![img_0.png](src/image/ArrayList扩容机制.png)


## Vector介绍
~~~
1.Vector底层也是一个对象数组，protected Object[] elementData;
2.Vector是线程同步的，即线程安全，Vector类的操作方法带有 synchronized
3.需要线程同步安全时，需要考虑使用Vector
~~~

Vector和ArrayList比较

![img_0.png](src/image/Vector和ArrayList比较.png)

Vector源码解析

~~~
//无参构造器 创建时

Vector vector = new Vector()

// 1.不传参数，默认走Vector的无参构造器，初始容量给 10
public Vector() {
    this(10);
}

// 2
public Vector(int initialCapacity) {
    this(initialCapacity, 0);
}

~~~

vector初始化后

![img_0.png](src/image/vector初始化.png)

vector扩容机制
~~~
// 1 判断扩容方法 ensureCapacityHelper(最小容量) 

public synchronized boolean add(E e) {
    modCount++;
    ensureCapacityHelper(elementCount + 1);
    elementData[elementCount++] = e;
    return true;
}

// 2 判断条件：当需要的最小容量比数组容量大时，执行grow()方法扩容

private void ensureCapacityHelper(int minCapacity) {
    if (minCapacity - elementData.length > 0)
        grow(minCapacity);
}

// 3 grow()方法

private void grow(int minCapacity) {
    int oldCapacity = elementData.length;
    int newCapacity = oldCapacity + ((capacityIncrement > 0) ?
                                     capacityIncrement : oldCapacity);
    if (newCapacity - minCapacity < 0)
        newCapacity = minCapacity;
    if (newCapacity - MAX_ARRAY_SIZE > 0)
        newCapacity = hugeCapacity(minCapacity);
    elementData = Arrays.copyOf(elementData, newCapacity);
}


~~~

## LinkedList介绍

~~~
1.LinkedList 底层实现了双向链表和双端队列
2.可以添加任意元素（元素可以重复），包括null
3.线程不安全，没有实现同步
~~~

LinkedList底层结构
~~~
1.LinkedList底层维护了一个双向链表
2.LinkedList中维护了两个属性first和last分别指向首节点和尾节点
3.每个节点（Node对象），里面又维护了prev、next、item三个属性，通过prev指向前一个，通过next指向后一个，实现双向链表‘
4.所以LinkedList的元素删除和添加，不是通过数组完成，相较于效率较高
~~~

双向链表图示

![img_0.png](src/image/双向链表.png)


LinkedList 源码解析
~~~
// LinkedList创建无参构造器过程
    LinkedList linkedList = new LinkedList();

//1 走LinkedList的无参构造器 初始化 size=0
    public LinkedList() {
    }
    
    transient int size = 0;
 
~~~

此时，size为0，first、last为Null

![img_0.png](src/image/LinkedList创建无参构造器过程.png)

第一次添加 add()方法解析
~~~

    linkedList.add(12);

//1 走 linkLast(e)方法
    public boolean add(E e) {
        linkLast(e);
        return true;
    }

//2 last=null，l也为null，此时first指向新节点，last也指向新节点
    void linkLast(E e) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(l, e, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
        modCount++;
    }
~~~

linkedList里面有值，last不为null，此时新节点的prev指向最后节点，最后节点的next指向新节点

LinkedList的删除方法

~~~
// remove() 默认删除第一个节点

//1
public E remove() {
    return removeFirst();
}

//2 第一个节点不为null，执行unlinkFirst(f)方法，删除第一个节点
public E removeFirst() {
    final Node<E> f = first;
    if (f == null)
        throw new NoSuchElementException();
    return unlinkFirst(f);
}

//3 unlinkFirst() 删除第一个节点
private E unlinkFirst(Node<E> f) {
    // assert f == first && f != null;
    final E element = f.item;
    final Node<E> next = f.next;
    f.item = null;
    f.next = null; // help GC
    first = next;
    if (next == null)
        last = null;
    else
        next.prev = null;
    size--;
    modCount++;
    return element;
}

~~~
















## Map框架

![img_0.png](src/image/Map.png)