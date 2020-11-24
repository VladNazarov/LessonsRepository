package ru.nazarov.vlad;

import org.springframework.stereotype.Component;

import java.util.function.Consumer;

/***
 * @author Rakhmankulov Ed
 */
@Component
public class SoutConsumer implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
