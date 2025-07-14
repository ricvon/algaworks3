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

public class InclusaoCozinhaMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApi3Application.class)
				.web(WebApplicationType.NONE).run(args);
<<<<<<< HEAD
		CozinhaRepository cozinhaRepository = applicationContext.getBean(CozinhaRepository.class);

		Cozinha cozinha1 = new Cozinha();
		cozinha1.setNome("Brasileira");
		cozinha1 = cozinhaRepository.salvar(cozinha1);
=======
		CadastroCozinha cadastroCozinha = applicationContext.getBean(CadastroCozinha.class);

		Cozinha cozinha1 = new Cozinha();
		cozinha1.setNome("Brasileira");
		cozinha1 = cadastroCozinha.salvar(cozinha1);
>>>>>>> 222d4b11b087eb8bf76784df0346a9344cf1ad24
		
		
		Cozinha cozinha2 = new Cozinha();
		cozinha2.setNome("Japonesa");		
<<<<<<< HEAD
		cozinha2 = cozinhaRepository.salvar(cozinha2);
=======
		cozinha2 = cadastroCozinha.salvar(cozinha2);
>>>>>>> 222d4b11b087eb8bf76784df0346a9344cf1ad24
		
		System.out.printf("%d - %s\n", cozinha1.getId(), cozinha1.getNome());

		System.out.printf("%d - %s\n", cozinha2.getId(), cozinha2.getNome());

	}
}
