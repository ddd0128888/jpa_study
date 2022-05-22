package hellojpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.JOINED) // join 전략 사용
@DiscriminatorColumn
public class item {

    @Id @GeneratedValue
    private Long id;

    private String name;
    private int price;
}
