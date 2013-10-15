package services;


import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

import models.Categoria;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CategoriaBO {

    @PersistenceContext
    EntityManager em;

    public void add(Categoria categoria) {
        em.persist(categoria);
    }

    public List<Categoria> getAll() {
        CriteriaQuery<Categoria> c = em.getCriteriaBuilder().createQuery(Categoria.class);
        c.from(Categoria.class);
        return em.createQuery(c).getResultList();
    }
    
}