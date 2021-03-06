package example.kakaopay.repository;

import example.kakaopay.domain.Institution;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class InstitutionRepository {

    private final EntityManager em;

    public void save(Institution institution){
        em.persist(institution);
    }
}
