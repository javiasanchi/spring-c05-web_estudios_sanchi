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



		Mercado mer1 = new Mercado(null, "Veracruz","descripcion","G92009639",10,true);
		Mercado mer2 = new Mercado(null, "Colón","descripcion","F59030725",12,false);
		Mercado mer3 = new Mercado(null, "Mayesi","descripcion","B73062730",12,true);
		Mercado mer4 = new Mercado(null, "Valderas","descripcion","C53597465",10,true);
		Mercado mer5 = new Mercado(null, "Ondarreta","descripcion","G93074197",12,true);


		mercadoRepo.saveAll(List.of(mer1,mer2,mer3,mer4,mer5));

		}
	}



