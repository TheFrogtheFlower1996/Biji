package list;

import java.util.ArrayList;

public class ArrayList源码分析 {
    public static void main(String[] args) {


        //使用无参构造器创建对象
        ArrayList list = new ArrayList();

        //添加10个数据
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        //添加5个数据
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        list.add(12);
        list.add(123);

    }
}
