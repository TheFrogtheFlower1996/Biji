package com.example.dxc.threadExit;

/**
 * @author zh
 * @version 1.0
 * @date 2021/12/27 10:51
 * 线程退出
 */
public class ThreadExit {
    public static void main(String[] args) throws InterruptedException {

        T t = new T();
        //线程执行
        t.start();

        //主线程休眠5秒执行
        Thread.sleep(5000);
        System.out.println("主线程执行");
        t.setLoop(false);
    }
}

class T extends Thread {

    private boolean loop = true;
    private int num = 0;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while (loop) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("线程执行中----" + (++num));
        }
    }
}