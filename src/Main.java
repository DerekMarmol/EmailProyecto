import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmailBuilder builder = new ConcreteEmailBuilder();
        Email email1 = builder
                .addRecipient("destinatario@ejemplo.com")
                .setSubject("Asunto importante")
                .setBody("Este es el cuerpo del correo electrónico.")
                .addAttachment("documento.pdf")
                .build();
        System.out.println("Email 1: " + email1);

        EmailDirector director = new EmailDirector(new ConcreteEmailBuilder());

        Email email2 = director.constructSimpleEmail(
                "simple@ejemplo.com",
                "Email simple",
                "Este es un email simple."
        );
        System.out.println("Email 2: " + email2);

        List<String> recipients = List.of("destinatario1@ejemplo.com", "destinatario2@ejemplo.com");
        List<String> attachments = List.of("archivo1.pdf", "archivo2.jpg");
        Email email3 = director.constructFullEmail(
                recipients,
                "Email completo",
                "Este es un email completo con múltiples destinatarios y adjuntos.",
                attachments
        );
        System.out.println("Email 3: " + email3);
    }
}
