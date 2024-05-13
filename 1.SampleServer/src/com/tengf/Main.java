package com.tengf;

public class Main {

    // 指定工作目录为 D:\zmo\project\How-Tomcat-Works\1.SampleServer
    public static void main(String[] args) {

        System.out.println("HttpServer Start! ");
        HttpServer server = new HttpServer();
        server.await();
        System.out.println("HttpServer Stop! ");
    }
}
