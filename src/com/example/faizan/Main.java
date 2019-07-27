package com.example.faizan;

public class Main {

    public static void main(String[] args) {
        // write your code here
        float [] temp=new float [10];
        int a=0;
        for(int i=1;i<=10;i++){
            double no = Math.random();
            float num=(float)((no*45)-10);
            temp[a]=num;
            System.out.println(temp[a]);
        }
    }
}
