package br.com.rv.algafood.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import br.com.rv.algafood.AlgafoodApi3Application;
import br.com.rv.algafood.domain.model.Cozinha;
<<<<<<< HEAD
import br.com.rv.algafood.domain.repository.CozinhaRepository;
=======
>>>>>>> 222d4b11b087eb8bf76784df0346a9344cf1ad24

public class ExclusaoCozinhaMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApi3Application.class)
				.web(WebApplicationType.NONE).run(args);
<<<<<<< HEAD
		CozinhaRepository cozinhaRepository = applicationContext.getBean(CozinhaRepository.class);

		Cozinha cozinha = new Cozinha();		
		cozinha.setId(1L);
		cozinhaRepository.remover(cozinha.getId());
=======
		CadastroCozinha cadastroCozinha = applicationContext.getBean(CadastroCozinha.class);

		Cozinha cozinha = new Cozinha();		
		cozinha.setId(1L);
		cadastroCozinha.remover(cozinha);
>>>>>>> 222d4b11b087eb8bf76784df0346a9344cf1ad24

	}
}
