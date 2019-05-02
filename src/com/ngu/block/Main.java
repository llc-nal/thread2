package com.ngu.block;

import com.ngu.block.demo1.MyRunnable1;
import com.ngu.block.demo1.MyThread1;

/**
 * @Author: 李良超
 * @Date: Created in 2019/4/28 22:55
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        Thread t1 = new MyThread1();
        Runnable r1 = new MyRunnable1();
        Thread t2 = new Thread(r1);
        t1.start();
        t2.start();
        System.out.println("主进程进入终结状态");
    }
}
