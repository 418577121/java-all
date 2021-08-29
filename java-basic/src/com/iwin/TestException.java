package com.iwin;

/**
 * @project_name: java-all
 * @package_name: com.iwin
 * @description:
 * @author: DingHaiTing
 * @create_time: 2021-08-29 10:06
 **/

public class TestException {
    public static void main(String[] args) {
        test1();
    }
    public static void test1() {
        System.out.println(111);
        try {
            int a  = 1/0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(222);
    }
}
