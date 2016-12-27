package com.hjc.shirodemo;

/**
 * Created by Bravowhale on 2016/12/26.
 * StringBuffer 线程安全类
 * StringBuilder 线程不安全类
 */
public class Test {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer();
        sb.append("新增");
        sb.append("ASDF");
        sb.append("ddd");
        System.out.println("test success"+sb.toString());
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("新增1");
        stringBuilder.append("sdfs");
        System.out.print("string:"+stringBuilder);
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                public void run() {
                    stringBuilder.append("新增1");
                    System.out.print("asd");
                }
            }).start();
        }

    }
}
