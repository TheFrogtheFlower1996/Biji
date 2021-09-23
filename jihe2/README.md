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



## Map框架

![img_0.png](src/image/Map.png)