package com.DIO.desafioIPhone.Smartphone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmartphoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartphoneApplication.class, args);

		Iphone iphone  = new Iphone();

		iphone.ligar("(54) 9999-8888");
		iphone.atender();
		iphone.iniciarCorreioVoz();

		iphone.exibirPagina("http://teste.com.br");
		iphone.adicionarPagina();
		iphone.atualizarPagina();
		iphone.fecharPagina();

		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica("Yellow");
	}
}
