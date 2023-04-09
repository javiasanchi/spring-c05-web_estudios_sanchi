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



		Mercado mer1 = new Mercado(null, "Veracruz","G92009639",10,true);
		Mercado mer2 = new Mercado(null, "Colón","F59030725",12,false);
		Mercado mer3 = new Mercado(null, "Mayesi","B73062730",12,true);

		mercadoRepo.saveAll(List.of(mer1,mer2,mer3));

		}
	}



