package com.xworkz.email.controoler;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.email.service.MailService;
@Component
@RequestMapping("/")
public class MailController {
	
	private static final Logger log=Logger.getLogger(MailController.class);
	
	@Autowired
	private MailService mailService;
	
	public MailController() {
		log.info("creted obj:mail controoler:.."+this.getClass().getSimpleName());	
	}
	
	@RequestMapping(value="/send.do" , method=RequestMethod.POST)
	public String sendMail(@RequestParam String tomailId,@RequestParam String subject,@RequestParam String body) {
		log.info("invoking send mail:..inside mailcontroller..");
		
		log.info("tomailid..:"+tomailId);
		log.info("subject:..."+subject);
		log.info("body mail:"+body);
		
		
		
		this.mailService.sendMailByEmailId(tomailId, subject, body);
		return "success";
		
	}

}
