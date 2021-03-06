package example.kakaopay.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class HousingFinance {

    @Id @GeneratedValue
    @Column(name = "housing_finance_id")
    private Long id;

    private int year;

    private int month;

}
