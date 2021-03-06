package example.kakaopay.repository;

import example.kakaopay.domain.HousingFinance;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class HousingFinanceRepository {

    private final EntityManager em;;

    private void save(HousingFinance housingFinance){
        em.persist(housingFinance);
    }
}
