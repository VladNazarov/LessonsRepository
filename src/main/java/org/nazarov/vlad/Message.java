package org.nazarov.vlad;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Message {
    private String header;
    private String body;
    private String recipient;

    public Message(String header, String body, String recipient) {
        this.header = header;
        this.body = body;
        this.recipient = recipient;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getHeader() {
        return header;
    }

    public String getBody() {
        return body;
    }

    public String getRecipient() {
        return recipient;
    }
}
