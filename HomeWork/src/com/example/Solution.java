package com.example;

import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Solution {
    private static ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();

    public static void main(String[] args) throws InterruptedException {

        var random = new Random();
        for (int i = 0; i <= 2000_000; i++) {
            queue.add(random.nextInt(1000));
        }

        Thread thread1 = new Calculation();
        Thread thread2 = new Calculation();
        Thread thread3 = new Calculation();

        thread1.start();
        thread2.start();
        thread3.start();

        thread3.join();
        System.out.println("Result: " + Calculation.getCount());

    }

    public static ConcurrentLinkedQueue<Integer> getQueue() {
        return queue;
    }
}
