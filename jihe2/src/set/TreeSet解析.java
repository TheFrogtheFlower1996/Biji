package set;

import java.util.Comparator;
import java.util.TreeSet;


public class TreeSet解析 {
    public static void main(String[] args) {
//        TreeSet treeSet = new TreeSet();

        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o2).compareTo((String) o1);
            }
        });



        treeSet.add("asd");
        treeSet.add("张果");
        treeSet.add("喜喜");
        treeSet.add("a妹妹");
        treeSet.add("蛇皮");

        System.out.println("treeSet="+treeSet);
    }
}
