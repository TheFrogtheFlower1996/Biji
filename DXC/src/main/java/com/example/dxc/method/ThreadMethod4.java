package com.example.dxc.method;

/**
 * @author zh
 * @version 1.0
 * @date 2021/12/27 15:51
 */
public class ThreadMethod4 {
    public static void main(String[] args) throws InterruptedException {

        T4 t4 = new T4();
        System.out.println(t4.getName()+" 线程状态 " + t4.getState());
        t4.start();

        while (Thread.State.TERMINATED != t4.getState()){
            System.out.println(t4.getName() + " " + t4.getState());
            Thread.sleep(1000);
        }
        System.out.println(t4.getName() + " 线程状态 " +t4.getState());

    }
}

class T4 extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <10 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("子线程执行 " + i);
        }

    }


}
