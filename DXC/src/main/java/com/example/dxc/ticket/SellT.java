package com.example.dxc.ticket;

/**
 * @author zh
 * @version 1.0
 * @date 2021/12/27 10:10
 * 三个窗口同时卖票问题
 */
public class SellT {
    public static void main(String[] args) {

//        Thread01 thread01 = new Thread01();
//        Thread01 thread02 = new Thread01();
//        Thread01 thread03 = new Thread01();
//        thread01.start();
//        thread02.start();
//        thread03.start();

        Thread02 thread021 = new Thread02();
        new Thread(thread021).start();
        new Thread(thread021).start();
        new Thread(thread021).start();

    }
}

//继承Thread()方法
class Thread01 extends Thread {

    private static int ticketNum = 100;

    @Override
    public void run() {
        while (ticketNum>=1){
            System.out.println("窗口"+Thread.currentThread().getName()+" "+(ticketNum--)+" 购票成功");
        }
    }
}

//实现Runnable接口
class Thread02 implements Runnable {

    private int ticketNum = 100;

    @Override
    public void run() {
        while (true){
            if (ticketNum <= 0){
                System.out.println("售票结束");
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口"+Thread.currentThread().getName()+" 剩余票数"+(--ticketNum)+" 购票成功");
        }
    }
}

