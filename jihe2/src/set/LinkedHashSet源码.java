package set;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet源码 {
    public static void main(String[] args) {

        Set set = new LinkedHashSet();
        set.add(new String());
        set.add(123);
        set.add(123);

    }
}
