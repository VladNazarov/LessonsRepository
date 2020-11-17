package com.example;

import java.math.BigInteger;
import java.util.Random;


public class Solution2 {
    private static int[] array;
    private static BigInteger result;

    public static void main(String[] args) throws InterruptedException {
        array = new int[2000_000];
        result = new BigInteger("0");
        var random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i=0; i<1000000; i++) {
                    sum += array[i];
                }
                result = result.add(BigInteger.valueOf(sum));
            }
        });


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i=1000000; i<2000000; i++) {
                    sum += array[i];
                }
                result = result.add(BigInteger.valueOf(sum));
            }
        });

        thread.start();
        thread2.start();
        thread2.join();


        System.out.println(result);


    }

}
