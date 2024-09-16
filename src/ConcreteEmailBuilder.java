import java.util.ArrayList;
import java.util.List;

public class ConcreteEmailBuilder implements EmailBuilder {
    private List<String> recipients = new ArrayList<>();
    private String subject;
    private String body;
    private List<String> attachments = new ArrayList<>();

    @Override
    public EmailBuilder addRecipient(String recipient) {
        this.recipients.add(recipient);
        return this;
    }

    @Override
    public EmailBuilder setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    @Override
    public EmailBuilder setBody(String body) {
        this.body = body;
        return this;
    }

    @Override
    public EmailBuilder addAttachment(String attachment) {
        this.attachments.add(attachment);
        return this;
    }

    @Override
    public Email build() {
        if (recipients.isEmpty()) {
            throw new IllegalStateException("Al menos un destinatario es requerido");
        }
        if (subject == null || subject.isEmpty()) {
            throw new IllegalStateException("El asunto es requerido");
        }
        if (body == null || body.isEmpty()) {
            throw new IllegalStateException("El cuerpo del correo es requerido");
        }
        return new Email(recipients, subject, body, attachments);
    }
}
