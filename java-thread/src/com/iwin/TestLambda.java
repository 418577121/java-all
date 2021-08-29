package com.iwin;

/**
 * @project_name: java-all
 * @package_name: com.iwin
 * @description:
 * @author: DingHaiTing
 * @create_time: 2021-08-29 12:28
 **/
/*
*  新生  -> 掉用start  -> 就绪 -> 获得执行权  -> 运行,执行run方法 -> 死亡
* */
public class TestLambda {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);

                    Thread.yield();
                }
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }).start();
    }
}
