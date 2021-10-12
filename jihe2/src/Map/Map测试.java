package Map;

import java.util.HashMap;
import java.util.Set;

public class Map测试 {
    public static void main(String[] args) {

        HashMap map = new HashMap();

        // put 添加
        map.put("hg","张三");
        map.put("jh","李四");
        map.put("hg","朱丽叶");
        map.put("key1",new Book("三国","100"));
        System.out.println(map);

        // remove(Object key) 删除
        Object hg = map.remove("hg");
        System.out.println(hg);

        // size() 返回元素个数
        int size = map.size();
        System.out.println(size);

        // isEmpty() 判断是否为空
        boolean empty = map.isEmpty();
        System.out.println(empty);

        // clear() 清空
        map.clear();

        System.out.println(map);

        // get(Object key) 获取
        System.out.println(map.get("hg"));

        // containsKey 查找键是否存在
        boolean jh = map.containsKey("jh");
        System.out.println(jh);
    }
}
class Book{
    private String name;
    private String number;

    public Book(String name, String number) {
        this.name = name;
        this.number = number;
    }
}
