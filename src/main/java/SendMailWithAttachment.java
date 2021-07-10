import java.io.File;
import java.io.IOException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class SendMailWithAttachment {
 
 public void Send() throws IOException {
  String to = "progejemplo95@gmail.com"; 
  final String from = "progejemplo95@gmail.com"; 
  final String password = "jeoKBw34!QhJ";
 
  Properties prop = new Properties();
  prop.put("mail.smtp.host", "smtp.gmail.com");
  prop.put("mail.smtp.port", "465");
  prop.put("mail.smtp.auth", "true");
  prop.put("mail.smtp.socketFactory.port", "465");
  prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
 
  Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
   protected PasswordAuthentication getPasswordAuthentication() {
    return new PasswordAuthentication(from, password);
   }
  });
 
  try {
 
   Message message = new MimeMessage(session);
   message.setFrom(new InternetAddress(from));
   message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
   message.setSubject("Mensaje desde Java");
    
   String msg = "Este email ha sido enviado desde Java :)";
    
   MimeBodyPart mimeBodyPart = new MimeBodyPart();
   mimeBodyPart.setContent(msg, "text/html");
     
   Multipart multipart = new MimeMultipart();
   multipart.addBodyPart(mimeBodyPart);
    
   MimeBodyPart attachmentBodyPart = new MimeBodyPart();
   attachmentBodyPart.attachFile(new File("E:\\Tools\\wallpapersea.jpg"));
   multipart.addBodyPart(attachmentBodyPart);
   message.setContent(multipart);
 
   Transport.send(message);
 
   System.out.println("El Mail se envio correctamente..");
 
  } catch (MessagingException e) {
   e.printStackTrace();
  }
 }
}