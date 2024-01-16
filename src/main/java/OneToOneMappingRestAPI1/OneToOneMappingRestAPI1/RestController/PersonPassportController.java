package OneToOneMappingRestAPI1.OneToOneMappingRestAPI1.RestController;

import OneToOneMappingRestAPI1.OneToOneMappingRestAPI1.Model.Passport;
import OneToOneMappingRestAPI1.OneToOneMappingRestAPI1.Model.Person;
import OneToOneMappingRestAPI1.OneToOneMappingRestAPI1.PayloadPackage.PersonPassport;
import OneToOneMappingRestAPI1.OneToOneMappingRestAPI1.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonPassportController {

    //service ka object 1st
    @Autowired
    private Service service;

    //Add Data
    @PostMapping("/saveData")
    public void saveInformation(@RequestBody PersonPassport temp){
        service.saveData(temp);
    }


    @GetMapping("displayAllData")
    public List<Person> getData(){
        return service.getData();
    }

    // Only Show/ Display PassportData Only

    @GetMapping("getPassportData")
    public List<Passport> getPassportData(){
        return service.getPassportData();
    }

}
