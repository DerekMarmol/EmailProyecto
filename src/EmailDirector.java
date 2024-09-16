import java.util.List;

public class EmailDirector {
    private EmailBuilder builder;

    public EmailDirector(EmailBuilder builder) {
        this.builder = builder;
    }

    public Email constructSimpleEmail(String recipient, String subject, String body) {
        return builder
                .addRecipient(recipient)
                .setSubject(subject)
                .setBody(body)
                .build();
    }

    public Email constructFullEmail(List<String> recipients, String subject, String body, List<String> attachments) {
        for (String recipient : recipients) {
            builder.addRecipient(recipient);
        }
        builder.setSubject(subject)
                .setBody(body);
        for (String attachment : attachments) {
            builder.addAttachment(attachment);
        }
        return builder.build();
    }
}
