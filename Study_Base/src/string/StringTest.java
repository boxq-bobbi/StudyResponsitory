package string;

/**
 * 关于StringBuffer和StringBuilder的使用
 *
 * @author boxingqi
 * @date 2019.11.25 11:51
 */
public class StringTest {


    /*
    String StringBuffer StringBuilder三者的异同？
    String：不可变的字符序列；底层使用char[]存储；
    StringBuffer：可变的字符序列；线程安全的，效率低；底层使用char[]存储；
    StringBuilder：可变的字符序列；jdk5.0新增的，线程不安全的，效率高；底层使用char[]存储；

    源码分析:
    String s1 = new String(); //new char[0]
    String s2 = new String("abc"); //new char[]{'a','b','c'}
    StringBuffer sb1 = new SringBuffer(); //char[] value = new char[16];底层创建了一个长度是16的数组
    sb1.append('a'); //value[0] = 'a';
    sb1.append('b'); //value[1] = 'b';

    StringBuffer sb2 = new StringBuffer("abc"); //char[] value = new char["abc".length() + 16];

    问题1：System.out.println(sb2.length());    3
    问题2：扩容问题：
        如果要添加的数据底层数组装不下了，那就需要扩容底层的数组，默认情况下，扩容为原来的2倍+2，
        同时将原来数组中的元素复制到新的数组中，
        如果扩容到原来的2倍+2不够，那么就扩容到新数组的长度，
        扩容的最大长度不大于Integer.MAX_VALUE --> 2^13-1 --> 2147483647。

    指导意义：开发中建议大家使用StringBuffer(int capacity)或者StringBuilder(int capacity)
     */

    public static void main(String[] args) {

    }

}
