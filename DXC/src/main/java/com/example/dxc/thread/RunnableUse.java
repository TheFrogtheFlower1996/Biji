package com.example.dxc.thread;

public class RunnableUse {
    public static void main(String[] args) {

       // Dog dog = new Dog();
       // Thread thread = new Thread(dog);
       // thread.start();

        Tiger tiger = new Tiger();//实现Runnable接口
        ThreadProxy threadProxy = new ThreadProxy(tiger);
        threadProxy.start();

    }
}
class Animal{}
class Tiger extends Animal implements Runnable {

    @Override
    public void run() {
        System.out.println("老虎嗷嗷叫啊 " + Thread.currentThread().getName());
    }
}


class ThreadProxy implements Runnable { //线程代理类

    private Runnable target = null;//属性是Runnable类型

    //有参构造器 可以接收一个实现 Runnable 接口的对象
    public ThreadProxy(Runnable target) {
        this.target = target;
    }

    @Override
    public void run() {
        if (target != null) {
            target.run();//动态绑定 运行类型Tiger
        }
    }
    public void start(){
        start0();//start0()方法真正实现多线程
    }
    public void start0(){
        run();
    }
}

class Dog implements Runnable { //通过实现Runnable接口 开发线程
    @Override
    public void run() { // 普通方法

        int count = 0;
        while (true) {
            System.out.println("小狗旺旺旺" + (count++) + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 5)break;
        }
    }
}
