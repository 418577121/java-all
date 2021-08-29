package com.iwin;

/**
 * @project_name: java-all
 * @package_name: com.iwin
 * @description:
 * @author: DingHaiTing
 * @create_time: 2021-08-29 13:24
 **/

public class Thread01 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread01(),"自定义线程名称");
        t1.start();
        System.out.println("线程名称" + t1);

    }
}
