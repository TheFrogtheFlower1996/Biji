package Iterator迭代器;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 迭代器执行原理
 * Iterator iterator = coll.iterator();//得到一个集合迭代器
 *
 * while(iterator.hasNext()){ // hesNext() 判断是否还有下一个元素
 *
 *     iterator.next() // next() 下移一位，并将该元素返回
 * }
 *
 * iterator迭代器遍历快捷键 itit
 *
 *
 *
 * */
public class Iterator {
    public static void main(String[] args) {

        Collection list = new ArrayList();
        list.add(new Book("qianbi","x",5.0));
        list.add(new Book("xiaodao","a",7.0));
        list.add(new Book("xiangpi","c",9.5));

        System.out.println(list);

        java.util.Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();

            System.out.println(next);
        }

//        iterator.next();//NoSuchElementException

        iterator = list.iterator();

    }
}

class Book {
    private String name;
    private String au;
    private Double price;

    public Book(String name, String au, Double price) {
        this.name = name;
        this.au = au;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAu() {
        return au;
    }

    public void setAu(String au) {
        this.au = au;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", au='" + au + '\'' +
                ", price=" + price +
                '}';
    }
}
