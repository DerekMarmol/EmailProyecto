import java.util.ArrayList;
import java.util.List;

public class Email {
    private final List<String> recipients;
    private final String subject;
    private final String body;
    private final List<String> attachments;

    Email(List<String> recipients, String subject, String body, List<String> attachments) {
        this.recipients = new ArrayList<>(recipients);
        this.subject = subject;
        this.body = body;
        this.attachments = new ArrayList<>(attachments);
    }

    // Getters
    public List<String> getRecipients() { return new ArrayList<>(recipients); }
    public String getSubject() { return subject; }
    public String getBody() { return body; }
    public List<String> getAttachments() { return new ArrayList<>(attachments); }

    @Override
    public String toString() {
        return "Email{" +
                "recipients=" + recipients +
                ", subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                ", attachments=" + attachments +
                '}';
    }
}
