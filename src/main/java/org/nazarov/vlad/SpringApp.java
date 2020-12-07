package org.nazarov.vlad;

import org.nazarov.vlad.config.MainConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * todo описание
 *
 * @author Rakhmankulov Ed
 */
public class SpringApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfiguration.class);

        InformationOfNameService informationOfNameService = applicationContext.getBean(InformationOfNameService.class);

        /*informationOfNameService.getInformation();*/

        var names = informationOfNameService.getInformationOfName().getNames();
        EmailService emailService = applicationContext.getBean(EmailService.class);
        Message message = applicationContext.getBean(Message.class);

        emailService.sendMessage(message);///For one
        int count = emailService.mailing("Header", "Body", names);//For list of names

        System.out.println("Count of sent messages : " + count);
    }

}
