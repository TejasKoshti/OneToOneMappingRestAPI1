package OneToOneMappingRestAPI1.OneToOneMappingRestAPI1.Service;


import OneToOneMappingRestAPI1.OneToOneMappingRestAPI1.Model.Passport;
import OneToOneMappingRestAPI1.OneToOneMappingRestAPI1.Model.Person;
import OneToOneMappingRestAPI1.OneToOneMappingRestAPI1.PayloadPackage.PersonPassport;
import OneToOneMappingRestAPI1.OneToOneMappingRestAPI1.Repository.PassPortRepository;
import OneToOneMappingRestAPI1.OneToOneMappingRestAPI1.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private PassPortRepository passPortRepository;


    public void saveData(PersonPassport temp){

        Person p1=new Person();

        Passport pass=new Passport();


        p1.setPersonName(temp.getPersonName());
        p1.setPersonAge(temp.getPersonAge());
        p1.setPersonSalary(temp.getPersonSalary());

        pass.setPassPortNumber(temp.getPassportNumber());
        pass.setPassPortCounty(temp.getPassportCounty());

        p1.setPassportRef(pass);
        personRepository.save(p1);


    }

    public List<Person> getData(){
        return personRepository.findAll();
    }

    public List<Passport> getPassportData(){
        return passPortRepository.findAll();
    }

}
