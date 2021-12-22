package list;

import java.util.ArrayList;
import java.util.List;

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