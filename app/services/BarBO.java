package services;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

import models.Bar;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BarBO {

    @PersistenceContext
    EntityManager em;


    public void add(Bar bar) {
        em.persist(bar);
    }


    public List<Bar> getAll() {
        CriteriaQuery<Bar> c = em.getCriteriaBuilder().createQuery(Bar.class);
        c.from(Bar.class);
        return em.createQuery(c).getResultList();
    }

}