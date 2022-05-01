package io.github.fhellipevalentin.agenda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.github.fhellipevalentin.agenda.model.entity.Contato;
import io.github.fhellipevalentin.agenda.model.repository.ContatoRepository;

@SpringBootApplication
public class AgendaApiApplication {

	@Bean
	public CommandLineRunner commandLineRunner(@Autowired ContatoRepository repository) {
		return args -> {
			Contato contato = new Contato();
			contato.setNome("Fulano");
			contato.setEmail("fulano@gmail.com");
			contato.setFavorito(true);
			repository.save(contato);
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(AgendaApiApplication.class, args);
	}

}
