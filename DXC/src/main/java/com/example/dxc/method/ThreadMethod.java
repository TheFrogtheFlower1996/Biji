package com.example.dxc.method;

/**
 * @author zh
 * @version 1.0
 * @date 2021/12/27 11:26
 */
public class ThreadMethod {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.setName("小张");
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();

        System.out.println(t.getName() + " 线程优先级 "+ t.getPriority());

        //主线程执行
        for (int i = 0; i < 5; i++) {
            System.out.println("hi " + Thread.currentThread().getName() +" "+ (++i));
            Thread.sleep(1000);
        }

        //线程被中断
        t.interrupt();

    }
}

class T extends Thread { //线程类

    @Override
    public void run() {

        while (true) {

            int num = 100;
            for (int i = 0; i < num; i++) {
                System.out.println("执行子线程---" + Thread.currentThread().getName() + " " + (++i));
            }

            try {
                System.out.println("休眠20s---");
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                //当该线程执行到Interrupt()方法时，就会catch一个异常，可以在里面加入自己业务逻辑
                //InterruptedException 是捕获到的一个中断异常
                System.out.println(Thread.currentThread().getName() + " 被 interrupt 捕捉到异常 ");
            }

        }
    }
}
