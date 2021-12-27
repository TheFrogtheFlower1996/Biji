package com.example.dxc.thread;

/**
 * @author zh
 * @version 1.0
 * @date 2021/12/23 17:09
 */
public class Thread03 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();
        thread2.start();
    }
}

//线程1
class T1 implements Runnable {
    int count = 0;
    @Override
    public void run() {
        while (count != 10){
            System.out.println("线程1 " + (count++) + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

//线程2
class T2 implements Runnable {
    int count = 0;
    @Override
    public void run() {
        while (count != 10){
            System.out.println("线程2 " + (count++) + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}