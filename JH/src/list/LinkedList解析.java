package list;

public class LinkedList解析 {
    public static void main(String[] args) {

        Node node1 = new Node("jack");
        Node node2 = new Node("tom");
        Node node3 = new Node("hsp");

        node1.next = node2;
        node2.next = node3;
        node3.pre = node2;
        node2.pre = node1;

        Node first = node1;
        Node last = node3;

        while (true) {
            if (first == null){
                break;
            }
            System.out.println(first);
            System.out.println(first.item+"1");
            first = first.next;
        }


        Node node25 = new Node("PoPo");

        // 添加
        node2.next = node25;
        node25.next = node3;
        node3.pre = node25;
        node25.pre = node2;

        while (true) {
            if (last == null){
                break;
            }
            System.out.println(last);
            System.out.println(last.item);
            last = last.pre;
        }




    }
}

// 定义一个Node类，Node对象表示双向链表的一个节点
class Node{
    public Object item;
    public Node next;
    public Node pre;
    public Node(Object name){
        this.item = name;
    }
    public String toString() {
        return "Node name=" + item;
    }
}
