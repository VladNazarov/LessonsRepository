package ru.nazarov.vlad;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

/**
 * @author Rakhmankulov Ed
 */
public class GenericsExperimentsDemo {
    public static void main(String[] args) {

    }

    private static void fillList(ArrayList list) {
        Random random = new Random(10);
        for (int i = 0; i < 1000; i++) {
            list.add(String.valueOf(random.nextInt()));
        }
    }

    static void doSomething(String a, Integer b) {

    }

    static void doSomething(Integer a, String b) {

    }


}
