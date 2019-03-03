package com.mandalart_server.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.*;

import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class MailSendUtils {

    private String user ="";
    private String password = "";

    @Autowired
    JavaMailSenderImpl mailSender;//보내는 계정의 정보가 들어가야함.

    public void sendMail(String userEmail, String content){
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", true);
        properties.put("mail.smtp.ssl.enable", true);
        properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        properties.put("mail.smtp.starttls.enable", true); //통신에 사용되는 데이터를 암호화


        JavaMailSender mailSender = new JavaMailSenderImpl();
        ((JavaMailSenderImpl) mailSender).setHost("smtp.gmail.com");
        ((JavaMailSenderImpl) mailSender).setPort(465); //gmail사용 시 STMP 서버와 통신하는 포트 번호
        ((JavaMailSenderImpl) mailSender).setUsername(user);
        ((JavaMailSenderImpl) mailSender).setPassword(password);
        ((JavaMailSenderImpl) mailSender).setJavaMailProperties(properties);

        MimeMessagePreparator preparator = new MimeMessagePreparator() {
            @Override
            public void prepare(MimeMessage mimeMessage) throws Exception {
                final MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true, "utf-8");
                helper.setFrom(user); //보내는 사람의 메일 주소
                helper.setTo(userEmail); //받는 사람의 메일 주소
                helper.setSubject("[mandalart] 알림 메일입니다.");
                helper.setText(content);
            }
        };

        mailSender.send(preparator);

    }
}
