public interface EmailBuilder {
    EmailBuilder addRecipient(String recipient);
    EmailBuilder setSubject(String subject);
    EmailBuilder setBody(String body);
    EmailBuilder addAttachment(String attachment);
    Email build();
}
