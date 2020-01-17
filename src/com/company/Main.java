package com.company;


public class Main {

    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("Первый", 10);
        MyThread myThread2 = new MyThread("Второй", 3);
        MyThread myThread3 = new MyThread("Третий",2);
        MyThread myThread4 = new MyThread("Четвертый",1);

        System.out.println("Первый: " + myThread1.t.getState());
        System.out.println("Второй: " + myThread2.t.getState());

        try {
            myThread1.t.join();
            myThread2.t.join();
            myThread3.t.join();
            myThread4.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Первый: " + myThread1.t.getState());
        System.out.println("Второй: " + myThread2.t.getState());

        System.out.println("Все потоки завершились");
    }
}
