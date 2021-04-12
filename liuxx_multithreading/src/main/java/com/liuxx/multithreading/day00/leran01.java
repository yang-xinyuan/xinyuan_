package com.liuxx.multithreading.day00;

/**
 * @program: liuxx_multithreading
 * @description:
 * @author: XinYuan.Yang
 * @create: 2021-04-12 16:58
 **/
public class leran01 {
    //TODO 知识点，设置守护线程之后，线程将不会运行，
    //TODO 原因：当目前剩下的活动线程全是守护线程的时候，JVM就会把当前的JVM关闭
    public static void main(String[] args) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(5000);
                }catch (Exception e){
                    e.printStackTrace();
                }
                Thread thread = Thread.currentThread();
                System.out.println("当前线程"+thread.getName());
            }
        };
        Thread thread = new Thread(task);
        thread.setDaemon(true);
        thread.setName("test-thread-1");
        thread.start();


    }
}
