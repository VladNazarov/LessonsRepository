package ru.nazarov.vlad;

import org.springframework.stereotype.Component;
import ru.nazarov.vlad.infra.DeprecatedBean;

import java.util.function.Consumer;

/***
 * @author Rakhmankulov Ed
 */
@DeprecatedBean
@Component
public class SoutConsumer implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
