package com.company;

class MyThread extends Thread{
    int count = 0;

    @Override
    public void run() {
        while (count < 10){
            System.out.println(count);
            count++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
