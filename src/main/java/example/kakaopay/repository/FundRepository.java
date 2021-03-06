package example.kakaopay.repository;

import example.kakaopay.domain.Fund;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class FundRepository {

    private final EntityManager em;

    public void save(Fund fund){
        em.persist(fund);
    }
}
