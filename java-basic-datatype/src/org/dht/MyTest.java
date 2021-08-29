package org.dht;

/**
 * java 中基本数据类型 4类八种
 * 1.整形  byte、short、int long
 * 2.浮点型  float、double
 * 3.字符型  char
 * 4.boolean  true、false
 */
public class MyTest {
    // 整形
    byte byteVar = 100; // 1个字节  -128 ~ 127
    short shortVar = 22223; // 2个字节
    int intVar = 5555555; // 4个字节 20亿左右
    long longVar = 11111111111111L; // 8个字节 取值范围... 默认是int 加L 用于区别int

    // 浮点类型
    float floatVar = 33.1f; // 4个字节 加 "f" 区分float和double
    double doubleVar = 44.1; // 8个字节

    // 字符型
    char charVar = '中'; // 2个字节

    // boolean
    boolean booleanTrue = true;
    boolean isBooleanFalse = false;
}
