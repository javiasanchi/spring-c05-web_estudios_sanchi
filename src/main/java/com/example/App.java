package com.example;

import com.example.entities.Mercado;
import com.example.repository.MercadoRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(App.class, args);
		MercadoRepository mercadoRepo = context.getBean(MercadoRepository.class);

		Mercado mercado1 = new Mercado(null,"Veracruz","G87463428",10);
		Mercado mercado2 = new Mercado(null,"Colón","F69208428",12);
		Mercado mercado3 = new Mercado(null,"Mayesi","B05208639",15);

		mercadoRepo.saveAll(List.of(mercado1,mercado2,mercado3));
	}

}
