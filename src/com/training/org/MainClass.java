package com.training.org;

public class MainClass {
    public static void main(String[] args) {
        YBank x1=new YBank();
        System.out.println(x1);

        YBank x2=new YBank("MyBank","USA",40000);
        System.out.println(x2);
    }
}
