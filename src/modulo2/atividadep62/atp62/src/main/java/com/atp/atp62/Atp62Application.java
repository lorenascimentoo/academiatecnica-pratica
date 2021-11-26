package com.atp.atp62;

import com.atp.atp62.model.Cliente;
import com.atp.atp62.repository.ClienteRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Atp62Application implements CommandLineRunner{
	private ClienteRepository cRepository;

	public Atp62Application(ClienteRepository cRepository) {
		this.cRepository = cRepository;
	}
	public static void main(String[] args) {
		SpringApplication.run(Atp62Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Cliente model = new Cliente();
		model.setNome("Harvey Specter");
		model.setCpf("222222222222");

		//salvando no BD
		cRepository.save(model);

		Cliente modelUpdate = new Cliente();
		modelUpdate.setId(1);
		modelUpdate.setNome("Donna Specter");
		modelUpdate.setCpf("11111111111");

		//atualizando no BD
		cRepository.save(modelUpdate);

		//deletando no BD
		cRepository.deleteById(2);
		//listando os dados do BD
		cRepository.findAll().forEach(c -> System.out.printf("ID: %d - NOME: %s - CPF: %s\n",c.getId(),c.getNome(),c.getCpf()));
	}

}
