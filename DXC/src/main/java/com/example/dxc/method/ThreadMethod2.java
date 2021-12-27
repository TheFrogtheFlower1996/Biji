package com.example.dxc.method;

/**
 * @author zh
 * @version 1.0
 * @date 2021/12/27 14:41
 */
public class ThreadMethod2 {
    public static void main(String[] args) throws InterruptedException {

        T2 t2 = new T2();
        t2.start();

        for (int i = 1; i <=20 ; i++) {
            Thread.sleep(1000);
            System.out.println("主线程 "+Thread.currentThread().getName()+" 吃了 "+ i +" 包子");
            if (i == 5){
//                t2.join();//线程插队
                Thread.yield();//线程礼让，不一定成功
            }
        }
    }
}

class T2 extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("子线程 " + Thread.currentThread().getName() +" 吃了 " +i+ " 包子");
        }
    }
}
