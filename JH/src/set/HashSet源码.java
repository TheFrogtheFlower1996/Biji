package set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashSet源码 {
    public static void main(String[] args) {

        Set set = new HashSet();
        for (int i = 0; i < 8; i++) {
            set.add(new A(i));
        }

        //循环第9次
        set.add(new A(98));
        //循环第十次
        set.add(new A(98));

        set.add(new A(8));

    }
}

class A {
    private int  i;

    public A(Integer i) {
        this.i = i;
    }
    
    @Override
    public int hashCode() {
        return 1768;
    }
}
