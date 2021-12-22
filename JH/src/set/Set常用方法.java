package set;

import java.util.HashSet;
import java.util.Set;

public class Set常用方法 {
    public static void main(String[] args) {

        Set set = new HashSet();

        set.add("jack");
        set.add("jack");
        set.add(new Dog("mark"));
        set.add(new Dog("mark"));
        set.add(null);
        set.add(null);
        set.add(new String("jack"));
        set.add(new String("jack"));
        System.out.println(set);


    }
}
class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
