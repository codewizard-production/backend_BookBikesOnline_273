package com.app.BookBikesOnline.repository;

import com.app.BookBikesOnline.model.Customer;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class CustomerRepository extends SimpleJpaRepository<Customer, String> {
    private final EntityManager em;
    public CustomerRepository(EntityManager em) {
        super(Customer.class, em);
        this.em = em;
    }
    @Override
    public List<Customer> findAll() {
        return em.createNativeQuery("Select * from \"bookbikesonline\".\"Customer\"", Customer.class).getResultList();
    }
}