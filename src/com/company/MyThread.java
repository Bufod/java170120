package com.company;

class MyThread implements Runnable{
    int count = 0;
    Thread t;

    public MyThread(String name, int priority) {
        t = new Thread(this, name);
        t.setPriority(priority);
        t.start();
    }

    @Override
    public void run() {
        while (count < 10){
            System.out.println(Thread
                    .currentThread()
                    .getName() + ": " + count);
            count++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}