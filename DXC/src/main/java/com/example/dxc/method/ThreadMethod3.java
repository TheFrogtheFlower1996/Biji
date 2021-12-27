package com.example.dxc.method;

/**
 * @author zh
 * @version 1.0
 * @date 2021/12/27 15:23
 */
public class ThreadMethod3 {
    public static void main(String[] args) throws InterruptedException {
        T3 t3 = new T3();

        t3.setDaemon(true);
        t3.start();

        for (int i = 1; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println("主线程执行 " +Thread.currentThread().getName()+i);
        }
    }
}

class T3 extends Thread {

    @Override
    public void run() {

        for (;;){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("子线程执行 "+Thread.currentThread().getName());
        }
    }
}
