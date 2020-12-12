package org.nazarov.vlad;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmailService {

    public void sendMessage(Message message) {
        System.out.println("Message to " + message.getRecipient() + ":");
        System.out.println("///////////////////////////////");
        System.out.println(message.getHeader());
        System.out.println("//////////////////////////////");
        System.out.println(message.getBody() + System.lineSeparator());
    }

    public int mailing(String header, String body, List<String> recipients) {
        int numberOfSent = 0;
        for (String recipient : recipients) {
            this.sendMessage(new Message(header, body, recipient));
            numberOfSent++;
        }
        return numberOfSent;
    }

}
