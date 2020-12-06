package org.nazarov.vlad;

import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
public class SoutConsumer implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
