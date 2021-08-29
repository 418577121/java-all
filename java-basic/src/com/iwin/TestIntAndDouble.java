package com.iwin;

/**
 * @project_name: java-all
 * @package_name: com.iwin
 * @description:
 * @author: DingHaiTing
 * @create_time: 2021-08-28 17:49
 **/

public class TestIntAndDouble {
    public static void main(String[] args) {
        byte age = 23; //  -128 ~ +127
       // byte byteNum = 140;
        short shortNum = 25000; // 大约正负三万  +30000 ~ -30000
        int intNum = 300000000; // 大约正负21亿   +21忆
        long longNum = 7000000000L; // 很大 大到可以表示地球上所有人
        int t1 = 065; // 八进制
        System.out.println(intNum);
        System.out.println(t1);

        // 浮点类型默认是 double  不精确 运算不要用浮点型

        float f1 = 0.1F;
        double d1 = 0.1;
        System.out.println(f1 == d1);
        String str1 = "\\t";
        System.out.println(str1);
        System.out.println(1111);


    }
}
