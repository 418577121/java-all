package com.iwin;

/**
 * @project_name: java-all
 * @package_name: com.iwin
 * @description:
 * @author: DingHaiTing
 * @create_time: 2021-08-29 12:17
 **/

public class TestThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <10; i++) {
            System.out.println(this.getName() + ":" + i);
        }
    }

    public static void main(String[] args) {
        TestThread t1 = new TestThread();
        TestThread t2 = new TestThread();
        t1.start();
        t2.start();
    }
}
