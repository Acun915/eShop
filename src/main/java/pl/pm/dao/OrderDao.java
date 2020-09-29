package pl.pm.dao;

import pl.pm.dto.Order;

import javax.persistence.EntityManager;

public class OrderDao {

    private EntityManager em = EntityManagerService.getEntityManagerFactory().createEntityManager();

    public boolean addOrder(Order order){
        em.getTransaction().begin();
        em.persist(order);
        em.getTransaction().commit();
        return true;
    }


}
