package OneToOneMappingRestAPI1.OneToOneMappingRestAPI1.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "passport")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Passport {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "passportIdGenerator")
    @SequenceGenerator(name = "passportIdGenerator", initialValue = 50000, allocationSize = 100)
    @Column(name = "passport_id")
    private int passPortId;

    @Column(name="passport_Number")
    private String passPortNumber;

    @Column(name="passport_county")
    private String passPortCounty;

}
