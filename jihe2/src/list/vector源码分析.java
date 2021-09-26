package list;

import java.util.List;
import java.util.Vector;

public class vector源码分析 {
    public static void main(String[] args) {

        //无参构造器
        List vector = new Vector();

        for (int i = 1; i <= 10; i++) {
            vector.add(i);
        }

        vector.add("11");

        //有参构造器
        Vector vector1 = new Vector(8);

        for (int i = 0; i < 8; i++) {
            vector1.add(i);
        }

        vector1.add(78);
    }
}
