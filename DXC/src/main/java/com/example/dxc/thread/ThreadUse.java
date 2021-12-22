package com.example.dxc.thread;

/**
 * @author zh
 * @version 1.0
 * @date 2021/12/22 9:43
 */
public class ThreadUse {
    public static void main(String[] args) throws InterruptedException {

        Cat cat = new Cat();
        //start()方法启动线程，最终会执行run()方法
        cat.start();
        //run()方法，串联执行，没有启动线程，执行完run()方法才会执行主线程，会造成阻塞
        //cat.run();

        System.out.println("主线程继续执行 "+Thread.currentThread().getName());
        for (int i = 0; i < 2; i++) {
            Thread.sleep(1000);
            System.out.println("主线程 i="+i);
        }
    }
}

/*
* 一个类继承Thread类，该类就可以当做一个线程使用；在run()方法中重写业务逻辑
* Thread类的run()方法 实现 Runnable接口的run()方法
*
* */
class Cat extends Thread {

    @Override
    public void run() {

        int times = 0;
        while (times != 5){
            times++;
            System.out.println("我是一个线程，每隔一秒执行一次 "+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}