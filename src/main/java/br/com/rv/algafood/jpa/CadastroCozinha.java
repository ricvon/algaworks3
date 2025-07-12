package br.com.rv.algafood.jpa;

import java.util.List;

import org.springframework.stereotype.Component;

import br.com.rv.algafood.domain.model.Cozinha;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Component
public class CadastroCozinha {
	@PersistenceContext
	private EntityManager manager;
	
	public List<Cozinha> listar(){
//		TypedQuery<Cozinha> query = manager.createQuery("from cozinha", Cozinha.class);
//		return query.getResultList();
		return manager.createQuery("from Cozinha", Cozinha.class)
				.getResultList();		
	}
}
