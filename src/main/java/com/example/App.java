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
		ApplicationContext context =  SpringApplication.run(App.class, args);
		MercadoRepository mercadoRepo = context.getBean(MercadoRepository.class);

		Mercado m1 = Mercado.builder()
				.nombre("Veracruz")
				.cif("G30417373")
				.numPuestos(12)
				.build();
		Mercado m2 = Mercado.builder()
				.nombre("Mayesi")
				.cif("S50086042")
				.numPuestos(12)
				.build();
		Mercado m3 = Mercado.builder()
				.nombre("Colón")
				.cif("B72916350")
				.numPuestos(12)
				.build();
		mercadoRepo.saveAll(List.of(m1,m2,m3));

	}

}
