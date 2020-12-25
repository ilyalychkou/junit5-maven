package sendingemail;


import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;
import javax.mail.Session;
import javax.mail.PasswordAuthentication;

public class SendEmailWithPlainTextExample {

    public static void main(String[] args) throws MessagingException {

        String password = "Lionil1980";
        String username = "ilya.lychkou@gmail.com";

        Properties prop = new Properties();
        prop.put("mail.smtp.auth", true);
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.host", "smtp.mailtrap.io");
        prop.put("mail.smtp.port", "25");
        prop.put("mail.smtp.ssl.trust", "smtp.mailtrap.io");

        Session session = Session.getInstance(prop, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        Session session1 = Session.getInstance(prop);


        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress("ilya.lychkou@gmail.com"));
        message.setRecipients(
                Message.RecipientType.TO, InternetAddress.parse("ilya.lychkou@gmail.com"));
        message.setSubject("Mail Subject");

        String msg = "This is my first email using JavaMailer";

        MimeBodyPart mimeBodyPart = new MimeBodyPart();
        mimeBodyPart.setContent(msg, "text/html");

        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(mimeBodyPart);

        message.setContent(multipart);
        Transport.send(message);
    }


}
