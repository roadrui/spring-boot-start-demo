package com.example.business;

// 我编写的业务组件
public class BusinessModule {
    private String url;

    private String pass;

    private String username;

    public BusinessModule(String url, String pass, String username) {
        this.url = url;
        this.pass = pass;
        this.username = username;
    }

    public void print() {
        System.out.println("url:" + url);
        System.out.println("pass:" + pass);
        System.out.println("username:" + username);
    }

}