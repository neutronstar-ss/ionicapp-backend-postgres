package com.neutronstar.ionicapp.services;

import org.springframework.mail.SimpleMailMessage;

import com.neutronstar.ionicapp.domain.Pedido;

public interface EmailService {
	
	void senderOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

}
