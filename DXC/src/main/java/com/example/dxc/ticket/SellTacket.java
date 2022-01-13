package com.example.dxc.ticket;

/**
 * @author zh
 * @version 1.0
 * @date 2021/12/27 16:58
 */
public class SellTacket {
    public static void main(String[] args) {
//        Thread3 thread3 = new Thread3();
//        Thread3 thread4 = new Thread3();
//        Thread3 thread5 = new Thread3();
        Thread3 thread3 = new Thread3();
        new Thread(thread3).start();
        new Thread(thread3).start();
        new Thread(thread3).start();
    }
}

//实现Runnable接口
class Thread3 implements Runnable {

    private int ticketNum = 100;
    private boolean loop = true;//控制run方法的变量
    Object object = new Object();

    /*
    * 如果是静态方法，锁在 类 上面
    *
    * */

    public synchronized static void m1() { }

    public static void m2() {
        synchronized (Thread3.class){ }
    }

    /*
    * 方法锁，锁在 this对象上
    * 同步代码块，互斥锁还是在this对象
    * */
    public /*synchronized*/ void sell() {
        synchronized (/*this*/object) {
            if (ticketNum <= 0) {
                System.out.println("售票结束....");
                loop = false;
                return;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口" + Thread.currentThread().getName() + " 购票成功 " + " 剩余票数" + (--ticketNum));
        }
    }

    @Override
    public void run() {
        while (loop){
            sell();
        }

    }
}
