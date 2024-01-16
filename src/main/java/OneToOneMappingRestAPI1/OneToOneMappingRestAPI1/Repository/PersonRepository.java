package OneToOneMappingRestAPI1.OneToOneMappingRestAPI1.Repository;

import OneToOneMappingRestAPI1.OneToOneMappingRestAPI1.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

}
