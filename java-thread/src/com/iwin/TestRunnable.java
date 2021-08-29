package com.iwin;

/**
 * @project_name: java-all
 * @package_name: com.iwin
 * @description:
 * @author: DingHaiTing
 * @create_time: 2021-08-29 12:25
 **/

public class TestRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new TestRunnable());
        Thread t2 = new Thread(new TestRunnable());
        t1.start();
        t2.start();
    }
}
