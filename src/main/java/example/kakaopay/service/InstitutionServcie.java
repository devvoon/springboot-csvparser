package example.kakaopay.service;

import example.kakaopay.domain.Institution;
import example.kakaopay.repository.InstitutionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class InstitutionServcie {
    private final InstitutionRepository institutionRepository;

    @Transactional
    public String save(Institution institution){
        validateDuplication(institution.getCode());
        institutionRepository.save(institution);
        String instituionCode = institution.getCode();
        return instituionCode;
    }

    private void validateDuplication(String code) {
        
    }


}
