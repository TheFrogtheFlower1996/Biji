package set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
* 定义一个Employee类，该类包含：private成员变量属性name、age
* 要求：
* 1.创建三个Employee对象放到HashSet中
* 2.当name和age相同时，就认为是相同员工，不添加
* */
public class HashSet练习 {
    public static void main(String[] args) {

        Set set = new HashSet();
        set.add(new Employee("jack",18));
        set.add(new Employee("rose",20));
        set.add(new Employee("jack",18));

    }
}
class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    //只要Objects.hash()里面的值相同，就返回相同的hash值
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}