package br.com.rv.algafood.jpa;

import java.util.List;

import org.springframework.stereotype.Component;

import br.com.rv.algafood.domain.model.Cozinha;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

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
	
	public Cozinha buscar(Long id) {
		return manager.find(Cozinha.class, id);
	}
	
	@Transactional
	public Cozinha salvar(Cozinha cozinha) {
		return manager.merge(cozinha);
	}
	
	@Transactional
	public void remover(Cozinha cozinha) {
		cozinha = buscar(cozinha.getId());//incluo esta linha para transformar o stado do bean de transient para managed, onde a busca transforma o estado para managed da instancia gerenciada pelo contexto de persistencia
		manager.remove(cozinha);
	}	
}
