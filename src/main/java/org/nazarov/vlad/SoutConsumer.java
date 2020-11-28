package org.nazarov.vlad;

import java.util.function.Consumer;

public class SoutConsumer implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
