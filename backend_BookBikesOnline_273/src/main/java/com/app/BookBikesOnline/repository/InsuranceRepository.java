package com.app.BookBikesOnline.repository;

import com.app.BookBikesOnline.model.Insurance;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class InsuranceRepository extends SimpleJpaRepository<Insurance, String> {
    private final EntityManager em;
    public InsuranceRepository(EntityManager em) {
        super(Insurance.class, em);
        this.em = em;
    }
    @Override
    public List<Insurance> findAll() {
        return em.createNativeQuery("Select * from \"bookbikesonline\".\"Insurance\"", Insurance.class).getResultList();
    }
}