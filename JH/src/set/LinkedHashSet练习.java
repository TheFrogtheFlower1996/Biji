package set;

import java.util.LinkedHashSet;
import java.util.Objects;

public class LinkedHashSet练习 {
    public static void main(String[] args) {

        LinkedHashSet set = new LinkedHashSet();

        set.add(new Car("三国","50"));
        set.add(new Car("三国","50"));

        System.out.println(set);

    }
}
class Car {
    public String name;
    public String price;

    public Car(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nCar{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    //重写equals和hashCode方法


    //如果name和price都相同则返回true
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return name.equals(car.name) && price.equals(car.price);
    }

    //如果name和price都相同，则返回相同的hash值
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, price);
//    }
}
