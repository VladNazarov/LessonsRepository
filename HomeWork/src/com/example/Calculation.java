package com.example;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;

public class Calculation extends Thread {
    private static ConcurrentLinkedQueue<Integer> queue = Solution.getQueue();
    private static AtomicLong count = new AtomicLong();

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            var num = queue.poll();
            if (num != null) {
                count.addAndGet(num);
            } else {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static AtomicLong getCount() {
        return count;
    }
}
