package com.xworkz.email.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

@Component
public class MailServiceImpl implements MailService {

	private static final Logger log = Logger.getLogger(MailServiceImpl.class);

	@Autowired
	private MailSender mailSender;

	public boolean sendMailByEmailId(String tomailId, String subject, String body) {
		log.info("inside sendMailByEmailId..invoking MailServiceImpl...");
		SimpleMailMessage mailMessage = new SimpleMailMessage();

		mailMessage.setTo(tomailId);
		mailMessage.setSubject(subject);
		mailMessage.setText(body);

		try {
			mailSender.send(mailMessage);
			log.info("mail sent successfully...!!");
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			log.info("mail not sent...");
		}
		return false;
	}
}
