package OneToOneMappingRestAPI1.OneToOneMappingRestAPI1.Repository;

import OneToOneMappingRestAPI1.OneToOneMappingRestAPI1.Model.Passport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassPortRepository extends JpaRepository<Passport, Integer> {
}
