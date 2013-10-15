package services;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

import models.Client;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ClientBO{

    @PersistenceContext
    EntityManager em;

    public void add(Client client) {
        em.persist(client);
    }

    public List<Client> getAll() {
        CriteriaQuery<Client> c = em.getCriteriaBuilder().createQuery(Client.class);
        c.from(Client.class);
        return em.createQuery(c).getResultList();
    }
    
    public Client get(Long id){
    	//CriteriaQuery<Client> c = em.getCriteriaBuilder().createQuery(Client.class);
        //c.from(Client.class);
        Client client = em.find(Client.class, id);
        return client;
        //return em.createQuery(c).setParameter("id", id).getSingleResult();
    }

}