package org.dht;

public class Operator {
    public static void main(String[] args) {
        int m = 7;
        int n = 7;
        int m1 = 2 * m++; // m1 = 14 后缀方式 使用变量原来的值
        int n1 = 2 * ++n; // n1 = 16 前缀方式 先进行+1运算
        System.out.println(m1);
        System.out.println(n1);

        double pow = Math.pow(2, 2);
        System.out.println(pow);

        String greeting= "Hello";
        int i = greeting.codePointCount(0, greeting.length());
        System.out.println(i);
    }
}
