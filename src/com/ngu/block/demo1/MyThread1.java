package com.ngu.block.demo1;

/**
 * @Author: 李良超
 * @Date: Created in 2019/4/28 22:56
 * @Description:
 */
public class MyThread1 extends Thread {

    @Override
    public void run() {
        int count = 1000;
        for (int i = 0; i < count; i++) {
            System.out.println(i + " $$$");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
