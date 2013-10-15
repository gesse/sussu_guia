package services;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

import models.Car;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CarBO {

    @PersistenceContext
    EntityManager em;

    public void add(Car car) {
        em.persist(car);
    }

    public List<Car> getAll() {
        CriteriaQuery<Car> c = em.getCriteriaBuilder().createQuery(Car.class);
        c.from(Car.class);
        return em.createQuery(c).getResultList();
    }

}