package com.iwin;

/**
 * @project_name: java-all
 * @package_name: com.iwin
 * @description:
 * @author: DingHaiTing
 * @create_time: 2021-08-29 09:18
 **/

public class TestForAndWhile {
    public static void main(String[] args) {
        // 循环打印 a~z
        char c = 'a';
        for (int i = 0; i < 26; i++) {
            char temp = (char)(c+i);
            System.out.print(temp + "\t");
        }

        // 打印乘法表
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j + "*" + i + "=" + (j*i) + "\t");
            }
            System.out.println("");
        }

    }
}
