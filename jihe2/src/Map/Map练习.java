package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map练习 {
    public static void main(String[] args) {

        Map map = new HashMap();
        map.put("1", new Staff("张三", 5000, 1));
        map.put("2", new Staff("李四", 8000, 2));
        map.put("3", new Staff("王五", 12000, 3));

        //keySet() 获取key的Set集合
        Set set = map.keySet();
        for (Object key : set) {
            Staff staff = (Staff) map.get(key);
            int salary = staff.getSalary();
            if (salary > 6000) {
                System.out.println(key + "-" + staff);
            }
        }

        // 使用entrySet()方法，获取k-v的Set集合
        Set set1 = map.entrySet();
        for (Object obj : set1) {
            Map.Entry obj1 = (Map.Entry) obj;
            Staff value = (Staff) obj1.getValue();
            if (value.getSalary() > 6000) {
                System.out.println(obj1.getClass());
                System.out.println(obj1.getKey() + "-" + obj1.getValue());
            }
        }
    }
}

class Staff {
    private String name;
    private int salary;
    private int id;

    public Staff(String name, int salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}
