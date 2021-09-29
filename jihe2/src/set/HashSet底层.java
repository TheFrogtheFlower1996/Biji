package set;

public class HashSet底层 {
    public static void main(String[] args) {

        //创建Node[] 数组
        Node[] table = new Node[16];

        //创建节点
        Node john = new Node("john", null);
        table[2] = john;
        Node jack = new Node("jack", null);
        john.next=jack;//挂载jack到john的next
    }
}

class Node { //节点类，存储数据，指向下一个节点
    Object item;
    Node next;
    public Node(Object item, Node next) {//有参构造
        this.item = item;
        this.next = next;
    }
}
