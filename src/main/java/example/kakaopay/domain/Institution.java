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
public class Institution {

    @Id @GeneratedValue
    @Column(name ="institution_id")
    private Long id;

    private String name;
    private String code;
}
