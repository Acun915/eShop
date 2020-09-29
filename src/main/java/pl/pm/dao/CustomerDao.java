package pl.pm.dao;

import pl.pm.dto.Customer;

import javax.persistence.EntityManager;

public class CustomerDao {

    private EntityManager em = EntityManagerService.getEntityManagerFactory().createEntityManager();

    public boolean addCustomer(Customer customer){
        em.getTransaction().begin();
        em.persist(customer);
        em.getTransaction().commit();
        return true;
    }

    public boolean deleteCustomer(int customerId) {
        Customer customer = findCustomerById(customerId);
        if (customer == null) {

            return false;
        }
        em.getTransaction().begin();
        em.remove((customer));
        em.getTransaction().commit();
        return true;
    }

    public boolean updateFirstName(int customerId, String newFirstName) {
        Customer customer = findCustomerById(customerId);
        if (customer == null) {
            return false;
        }
        em.getTransaction().begin();
        customer.setFirstName(newFirstName);
        em.getTransaction().commit();
        return true;
    }

    public boolean updateLastName(int customerId, String newLastName) {
        Customer customer = findCustomerById(customerId);
        if (customer == null) {
            return false;
        }
        em.getTransaction().begin();
        customer.setFirstName(newLastName);
        em.getTransaction().commit();
        return true;
    }


    private Customer findCustomerById(int customerId) {
        return em.find(Customer.class, customerId);
    }

}
