package set;

//import com.sun.org.apache.xpath.internal.operations.String;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@SuppressWarnings({"all"})
public class LinkedHashSet源码 {
    public static void main(String[] args) {

        HashMap hashMap = new HashMap();


        LinkedHashSet set = new LinkedHashSet();
        set.add(new String("aa"));
        set.add(456);
        set.add(456);
        set.add(new Customer("张三"));
        set.add(123);
        set.add("abc");

        System.out.println(set);
    }
}
class Customer {
    public String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


}
