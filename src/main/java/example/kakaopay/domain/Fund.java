package example.kakaopay.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Fund {

    @Id @GeneratedValue
    @Column(name = "fund_id")
    private int id;

    private int year;
    private int month;
    private int code;
    private String name;
    private int amount;

}
