package com.johannes.SoapExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.jws.WebService;


@WebService (targetNamespace="http://SoapExample.johannes.com/", serviceName="PersonServiceImplService", portName="PersonServiceImplPort", wsdlLocation="WEB-INF/wsdl/PersonServiceImplService.wsdl")
public class PersonServiceImplDelegate{

    com.johannes.SoapExample.PersonServiceImpl _personServiceImpl = null;

    public boolean addPerson (Person p) {
        return _personServiceImpl.addPerson(p);
    }

    public boolean deletePerson (int id) {
        return _personServiceImpl.deletePerson(id);
    }

    public Person getPerson (int id) {
        return _personServiceImpl.getPerson(id);
    }

    public Person[] getAllPersons () {
        return _personServiceImpl.getAllPersons();
    }

    public PersonServiceImplDelegate() {
        _personServiceImpl = new com.johannes.SoapExample.PersonServiceImpl(); }

}