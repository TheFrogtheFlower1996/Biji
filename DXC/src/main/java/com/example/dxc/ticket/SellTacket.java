package com.example.dxc.ticket;

/**
 * @author zh
 * @version 1.0
 * @date 2021/12/27 16:58
 */
public class SellTacket {
    public static void main(String[] args) {
        Thread3 thread3 = new Thread3();
        Thread3 thread4 = new Thread3();
        Thread3 thread5 = new Thread3();
        new Thread(thread3).start();
        new Thread(thread4).start();
        new Thread(thread5).start();
    }
}

//实现Runnable接口
class Thread3 implements Runnable {

    private int ticketNum = 100;
    private boolean loop = true;

    public synchronized void sell() {
        while (loop){
            if (ticketNum <= 0){
                System.out.println("售票结束");
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口"+Thread.currentThread().getName()+" 剩余票数"+(ticketNum--)+" 购票成功");
        }
    }
    @Override
    public void run() {
        sell();
    }
}
