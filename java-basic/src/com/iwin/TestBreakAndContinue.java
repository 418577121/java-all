package com.iwin;

/**
 * @project_name: java-all
 * @package_name: com.iwin
 * @description:
 * @author: DingHaiTing
 * @create_time: 2021-08-29 09:10
 **/

public class TestBreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                break;
            }
            System.out.println(i);
        }
    }
}
