package br.com.rv.algafood.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import br.com.rv.algafood.AlgafoodApi3Application;
import br.com.rv.algafood.domain.model.Cozinha;

import br.com.rv.algafood.domain.repository.CozinhaRepository;

public class BuscaCozinhaMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApi3Application.class)
				.web(WebApplicationType.NONE).run(args);
		CozinhaRepository cozinhaRepository = applicationContext.getBean(CozinhaRepository.class);
		Cozinha cozinha = cozinhaRepository.buscar(1L);
		System.out.println(cozinha.getNome());

	}
}
