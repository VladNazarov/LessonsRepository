package org.nazarov.vlad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * todo описание
 *
 * @author Rakhmankulov Ed
 */
public class SpringApp {
    //создать контекст сервиса который по System.in принимает запрос с названием файла в определенной папке
    //в файле список имен. На выход(предусмотреть несколько варинтов) он выдает самое длинное имя, Кол-во дубликатов, общее кол-во имен
    //весь контекст нужно сделать в xml файле

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("org/nazarov/vlad/applicationContext.xml");

        InformationOfNameService informationOfNameService  = applicationContext.getBean(InformationOfNameService.class);

        informationOfNameService.getInformation();
    }

}
