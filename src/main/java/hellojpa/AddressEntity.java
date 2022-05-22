package hellojpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter  
@Entity
public class AddressEntity {

    @Id @GeneratedValue
    private Long id;

    // Address를 랩핑해주는 개념 (Integer, Float처럼)
    private Address address;


    public AddressEntity(Long id, Address address) {
        this.id = id;
        this.address = address;
    }
}
